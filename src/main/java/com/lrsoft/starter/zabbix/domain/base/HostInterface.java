package com.lrsoft.starter.zabbix.domain.base;

public class HostInterface {
    private String interfaceid;        //接口编号
    private String dns;                //dns地址
    private String hostid;            //设备编号
    private String ip;                //ip地址
    private Integer main;            //配置多个ip的先后顺序
    private String port;            //端口
    private String type;            //监控方式的类型
    private String useip;            //是否使用ip
    private Integer bulk;           //是否使用批量SNMP请求
    private Integer items;           //包含多少使用的item

    public void setInterfaceid(String interfaceid) {
        this.interfaceid = interfaceid;
    }

    public String getInterfaceid() {
        return interfaceid;
    }

    public void setDns(String dns) {
        this.dns = dns;
    }

    public String getDns() {
        return dns;
    }

    public void setHostid(String hostid) {
        this.hostid = hostid;
    }

    public String getHostid() {
        return hostid;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setMain(Integer main) {
        this.main = main;
    }

    public Integer getMain() {
        return main;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPort() {
        return port;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setUseip(String useip) {
        this.useip = useip;
    }

    public String getUseip() {
        return useip;
    }

    public Integer getBulk() {
        return bulk;
    }

    public void setBulk(Integer bulk) {
        this.bulk = bulk;
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }
}
