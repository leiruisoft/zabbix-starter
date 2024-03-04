package com.lrsoft.starter.zabbix.core;

import cn.hutool.json.JSONUtil;

public class ZabbixResponse {
    private String jsonrpc = Constants.JSONRPC_VERSION;
    private Object result;
    private Object error;
    private Integer id;

    public ZabbixResponse() {
    }

    public ZabbixResponse(String jsonrpc, Object result, Object error, Integer id) {
        this.jsonrpc = jsonrpc;
        this.result = result;
        this.error = error;
        this.id = id;
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
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
