package com.tcpip147.websupport;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class Prettier {

    private static final Prettier INSTANCE = new Prettier();
    private Process process;

    private Prettier() {

    }

    public static Prettier getInstance() {
        return INSTANCE;
    }

    private Map<String, PrettierObservable> observables = new HashMap<>();

    public void subscribe(String key, PrettierObservable observable) {
        observables.put(key, observable);
    }

    public void publish(String key, String text) {
        observables.get(key).publish(text);
    }

    public void call(String key, String text) {
        try {
            OutputStream out = process.getOutputStream();
            byte[] bytes = ("css\n" + key + "\n" + text).getBytes();
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
