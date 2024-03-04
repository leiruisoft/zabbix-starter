package com.lrsoft.starter.zabbix.domain.base;

public class Template {
    private String templateid;
    private String host;
    private String description;
    private String name;

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
