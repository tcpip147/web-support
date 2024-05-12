package com.tcpip147.websupport;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.ProjectActivity;
import com.tcpip147.websupport.node.NodeJsObserver;
import com.tcpip147.websupport.node.NodeJsResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class OnStartupProject implements ProjectActivity {

    private static final String TEMP_DIR = System.getProperty("idea.plugins.path") + File.separator + "web-support";
    private static final File NODE_DIR = new File(TEMP_DIR + File.separator + "node");

    @Nullable
    @Override
    public Object execute(@NotNull Project project, @NotNull Continuation<? super Unit> continuation) {
        System.out.println("node directory : " + TEMP_DIR);
        if (!NODE_DIR.exists()) {
            NODE_DIR.mkdir();
        }
        makeEntryFile();
        installModules();
        loadProcessor();
        return null;
    }

    private void makeEntryFile() {
        File entry = new File(NODE_DIR + File.separator + "entry.js");
        if (!entry.exists()) {
            try {
                String text = """
                        const prettier = require("prettier");
                        const postcss = require("postcss");
                                                
                        process.stdin.on("data", (data) => {
                            const request = parseProtocol(data);
                            if (request.moduleType == "prettier") {
                                prettier.format(request.body, { parser: request.parameter }).then(res => {
                                    response(request, res);
                                });
                            }
                        });
                             
                        function parseProtocol(data) {
                            const raw = Buffer.from(data).toString();
                            const firstIndex = raw.indexOf("\\n");
                            const secondIndex = raw.indexOf("\\n", firstIndex + 1);
                            const firstLine = raw.substring(0, firstIndex);
                            const firstLineA = firstLine.split(" ");
                            const moduleType = firstLineA[0];
                            let parameter;
                            if (firstLineA.length > 1) {
                                parameter = firstLineA[1];
                            }
                            const requestId = raw.substring(firstIndex + 1, secondIndex);
                            const body = raw.substring(secondIndex + 1);
                            return { moduleType, parameter, requestId, body };
                        }
                        
                        function response(request, body) {
                            console.log(request.moduleType + "\\n" + request.requestId + "\\n" + body + "\\n<!EOF>");
                        }
                        """;
                Files.write(entry.toPath(), text.getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void installModules() {
        ProcessBuilder processBuilder = new ProcessBuilder().directory(NODE_DIR);
        List<String> commands = new ArrayList<>();
        commands.add("npm.cmd");
        commands.add("install");
        commands.add("prettier");
        commands.add("postcss");
        processBuilder.command(commands);
        try {
            processBuilder.redirectErrorStream();
            Process process = processBuilder.start();
            process.waitFor();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void loadProcessor() {
        ProcessBuilder processBuilder = new ProcessBuilder().directory(NODE_DIR);
        List<String> commands = new ArrayList<>();
        commands.add("node");
        commands.add("entry.js");
        processBuilder.command(commands);
        Process process;
        Thread thread = null;
        try {
            processBuilder.redirectErrorStream();
            process = processBuilder.start();
            NodeJsObserver.getInstance().setProcess(process);
            thread = new Thread(new Task(process.getInputStream()));
            thread.start();
        } catch (Exception e) {
            thread.interrupt();
        }
    }

    private static class Task implements Runnable {
        private BufferedReader br;

        public Task(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
        }

        @Override
        public void run() {
            StringBuffer sb = new StringBuffer();
            String line;
            while (true) {
                try {
                    int i = 0;
                    while ((line = br.readLine()) != null) {
                        if ("<!EOF>".equals(line)) {
                            NodeJsObserver.getInstance().publish(new NodeJsResponse(sb.toString()));
                            sb.setLength(0);
                            break;
                        }
                        if (i++ > 0) {
                            sb.append("\n");
                        }
                        sb.append(line);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
