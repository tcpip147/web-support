package com.tcpip147.websupport;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.ProjectActivity;
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
    private static final File PRETTIER_DIR = new File(TEMP_DIR + File.separator + "prettier");

    @Nullable
    @Override
    public Object execute(@NotNull Project project, @NotNull Continuation<? super Unit> continuation) {
        if (!PRETTIER_DIR.exists()) {
            PRETTIER_DIR.mkdir();
        }
        makeEntry();
        installPrettier();
        loadPrettier();
        return null;
    }

    private void makeEntry() {
        File entry = new File(PRETTIER_DIR + File.separator + "entry.js");
        if (!entry.exists()) {
            try {
                String text = """
                        const prettier = require("prettier");
                        
                        process.stdin.on("data", (data) => {
                            const protocol = Buffer.from(data).toString();
                            const parserIndex = protocol.indexOf("\\n");
                            const parser = protocol.substring(0, parserIndex);
                            const keyIndex = protocol.indexOf("\\n", parserIndex + 1);
                            const key = protocol.substring(parserIndex + 1, keyIndex);
                            const text = protocol.substring(keyIndex + 1);
                            prettier.format(text, { parser: parser })
                                .then(res => {
                                    console.log(res + "\\n<!EOF>\\n" + key);
                                })
                        });
                        """;
                Files.write(entry.toPath(), text.getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void installPrettier() {
        ProcessBuilder processBuilder = new ProcessBuilder().directory(PRETTIER_DIR);
        List<String> commands = new ArrayList<>();
        commands.add("npm.cmd");
        commands.add("install");
        commands.add("prettier");
        processBuilder.command(commands);
        try {
            processBuilder.redirectErrorStream();
            Process process = processBuilder.start();
            process.waitFor();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void loadPrettier() {
        ProcessBuilder processBuilder = new ProcessBuilder().directory(PRETTIER_DIR);
        List<String> commands = new ArrayList<>();
        commands.add("node");
        commands.add("entry.js");
        processBuilder.command(commands);
        Process process;
        Thread thread = null;
        try {
            processBuilder.redirectErrorStream();
            process = processBuilder.start();
            Prettier.getInstance().setProcess(process);
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
                            line = br.readLine();
                            Prettier.getInstance().publish(line, sb.toString());
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
