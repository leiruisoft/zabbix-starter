package com.lrsoft.starter.zabbix.domain.base;

public class IntegerHistory {
    private String clock;    //采集时间
    private String itemid;    //监控项编号
    private Integer ns;        //采集时间的纳秒数
    private Integer value;    //值
    private Integer type;    //值的类型


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }

    public String getClock() {
        return clock;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getItemid() {
        return itemid;
    }

    public void setNs(Integer ns) {
        this.ns = ns;
    }

    public Integer getNs() {
        return ns;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}

