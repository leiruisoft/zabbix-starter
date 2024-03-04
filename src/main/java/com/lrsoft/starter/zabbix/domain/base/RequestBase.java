package com.lrsoft.starter.zabbix.domain.base;

public class RequestBase {

    private String method;

    public RequestBase(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

}
