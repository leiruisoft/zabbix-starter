package com.lrsoft.starter.zabbix.core;

import cn.hutool.json.JSONUtil;

public class ZabbixRequest {
    private String jsonrpc;
    private String method;
    private String auth;
    private Integer id;

    public ZabbixRequest() {
    }

    public ZabbixRequest(String method) {
        this.jsonrpc = Constants.JSONRPC_VERSION;
        this.method = method;
        if (!"user.login".equalsIgnoreCase(method)) {
            this.auth = "";
        }
        this.id = 1;
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return JSONUtil.toJsonStr(this);
    }

}
