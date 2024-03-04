package com.lrsoft.starter.zabbix.domain.hostgroup;


import com.lrsoft.starter.zabbix.core.ZabbixRequest;
import com.lrsoft.starter.zabbix.domain.base.HostGroup;

import java.util.List;

public class HostGroupCreateRequest extends ZabbixRequest {
    public HostGroupCreateRequest() {
        super("hostgroup.create");
    }

    private List<HostGroup> params;

    public void setParams(List<HostGroup> params) {
        this.params = params;
    }

    public List<HostGroup> getParams() {
        return params;
    }
}
