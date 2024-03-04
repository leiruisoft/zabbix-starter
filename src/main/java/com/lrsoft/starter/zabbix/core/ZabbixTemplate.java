package com.lrsoft.starter.zabbix.core;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

public class ZabbixTemplate implements ZabbixOperations, InitializingBean {

    private ZabbixConnectionFactory connectionFactory;


    public ZabbixTemplate(ZabbixConnectionFactory zabbixConnectionFactory) {
        Assert.notNull(zabbixConnectionFactory);
        this.connectionFactory = zabbixConnectionFactory;
    }

    public ZabbixConnectionFactory getConnectionFactory() {
        return connectionFactory;
    }

    public void afterPropertiesSet() {
        Assert.notNull(connectionFactory, "ZabbixConnectionFactory is required");
    }

    @Override
    public <T> T execute(ZabbixCallback<T> action) {
        Assert.notNull(action);
        ZabbixConnection conn = this.getConnection();
        return postProcessResult(action.doInZabbix(conn));
    }

    @Override
    public String apiVersion() {
        return execute(connection -> {
            ZabbixRequest request = RequestBuilder.newBuilder().method("apiinfo.version").build();
            ZabbixResponse response = connection.execute(request);
            return response.getResult().toString();
        });
    }


    private ZabbixConnection getConnection() {
        return getConnectionFactory().getConnection();
    }

    protected <T> T postProcessResult(T result) {
        return result;
    }
}
