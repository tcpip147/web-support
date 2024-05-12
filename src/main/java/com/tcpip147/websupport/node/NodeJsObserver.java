package com.tcpip147.websupport.node;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class NodeJsObserver {

    private static final NodeJsObserver INSTANCE = new NodeJsObserver();
    private Process process;

    private NodeJsObserver() {
    }

    public static NodeJsObserver getInstance() {
        return INSTANCE;
    }

    private Map<String, NodeJsObservable> observables = new HashMap<>();

    public void subscribe(String key, NodeJsObservable observable) {
        observables.put(key, observable);
    }

    public void publish(NodeJsResponse response) {
        observables.get(response.getRequestId()).publish(response.getModuleType(), response.getBody());
    }

    public void call(NodeJsRequest request) {
        try {
            OutputStream out = process.getOutputStream();
            byte[] bytes = (request.build()).getBytes();
            out.write(bytes);
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setProcess(Process process) {
        this.process = process;
    }
}
