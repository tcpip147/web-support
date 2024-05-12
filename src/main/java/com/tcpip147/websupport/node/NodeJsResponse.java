package com.tcpip147.websupport.node;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NodeJsResponse {

    private static final Logger log = LoggerFactory.getLogger(NodeJsResponse.class);
    private String moduleType;
    private String requestId;
    private String body;

    public NodeJsResponse(String raw) {
        int firstIndex = raw.indexOf("\n");
        int secondIndex = raw.indexOf("\n", firstIndex + 1);
        this.moduleType = raw.substring(0, firstIndex);
        this.requestId = raw.substring(firstIndex + 1, secondIndex);
        this.body = raw.substring(secondIndex + 1);
    }

    public String getModuleType() {
        return moduleType;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getBody() {
        return body;
    }
}
