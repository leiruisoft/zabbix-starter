package com.lrsoft.starter.zabbix;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "zabbix")
public class ZabbixProperties {
    //zabbix服务地址
    private String url = "http://127.0.0.1";
    private String username = "Admin";
    private String password = "zabbix";
    //zabbix管理平台设置用户永久登录时数据库表里对应的auth
    private String auth = "dd871337c5638a8ed4369d032b2cbf9c";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }
}
