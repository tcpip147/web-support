package com.tcpip147.websupport.node;

public class NodeJsRequest {

    public static final String MODULE_TYPE_PRETTIER = "prettier";
    public static final String MODULE_TYPE_TOKEN = "token";
    public static final String MODULE_TYPE_AUTO_COMPLETE = "autoComplete";

    private String moduleType;
    private String parameter;
    private String requestId;
    private String body;

    public NodeJsRequest(String moduleType, String parameter, String requestId, String body) {
        this.moduleType = moduleType;
        this.parameter = parameter;
        this.requestId = requestId;
        this.body = body;
    }

    public String build() {
        if (parameter != null) {
            return moduleType + " " + parameter + "\n" + requestId + "\n" + body;
        } else {
            return moduleType + "\n" + requestId + "\n" + body;
        }
    }
}
