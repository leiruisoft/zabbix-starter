package com.lrsoft.starter.zabbix.domain.base;
public class HostGroup {
	private String groupid;		//设备组编号
	private String name;		//设备名称
	private Integer internal;	//是否内置（0，否；1，是）
	private String flags;

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setInternal(Integer internal) {
		this.internal = internal;
	}
	public Integer getInternal() {
		return internal;
	}
	public String getFlags() {
		return flags;
	}
	public void setFlags(String flags) {
		this.flags = flags;
	}
}
