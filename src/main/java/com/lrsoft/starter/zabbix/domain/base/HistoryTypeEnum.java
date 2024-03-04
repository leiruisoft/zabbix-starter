package com.lrsoft.starter.zabbix.domain.base;

/**
 * 要返回的历史对象类型.
 * <p>
 * 可能的值:
 * 0 - 数字浮点;
 * 1 - 字符串;
 * 2 - 日志;
 * 3 - 无符号数字;
 * 4 - 文本.
 * <p>
 * 默认值: 3.
 */
public enum HistoryTypeEnum {
    FLOAT(0, "数字浮点"),
    VARCHAR(1, "字符串"),
    LOG(2, "日志"),
    UNSIGNED(3, "无符号数字"),
    TEXT(4, "文本");

    private final Integer status;
    private final String name;

    HistoryTypeEnum(Integer status, String name) {
        this.status = status;
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }
}
