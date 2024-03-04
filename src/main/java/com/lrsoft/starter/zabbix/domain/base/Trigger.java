package com.lrsoft.starter.zabbix.domain.base;

public class Trigger {
    private String triggerid;
    private String description;
    private String expression;
    private String comments;
    private String error;
    private Integer flags;
    private String lastchange;
    private Integer priority;
    private Integer state;
    private Integer status;
    private String templateid;
    private Integer type;
    private String url;
    private Integer value;
    private Integer recovery_mode;
    private String recovery_expression;
    private Integer correlation_mode;
    private String correlation_tag;
    private Integer manual_close;

    public void setTriggerid(String triggerid) {
        this.triggerid = triggerid;
    }

    public String getTriggerid() {
        return triggerid;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setLastchange(String lastchange) {
        this.lastchange = lastchange;
    }

    public String getLastchange() {
        return lastchange;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getRecovery_mode() {
        return recovery_mode;
    }

    public void setRecovery_mode(Integer recovery_mode) {
        this.recovery_mode = recovery_mode;
    }

    public String getRecovery_expression() {
        return recovery_expression;
    }

    public void setRecovery_expression(String recovery_expression) {
        this.recovery_expression = recovery_expression;
    }

    public Integer getCorrelation_mode() {
        return correlation_mode;
    }

    public void setCorrelation_mode(Integer correlation_mode) {
        this.correlation_mode = correlation_mode;
    }

    public String getCorrelation_tag() {
        return correlation_tag;
    }

    public void setCorrelation_tag(String correlation_tag) {
        this.correlation_tag = correlation_tag;
    }

    public Integer getManual_close() {
        return manual_close;
    }

    public void setManual_close(Integer manual_close) {
        this.manual_close = manual_close;
    }
}
