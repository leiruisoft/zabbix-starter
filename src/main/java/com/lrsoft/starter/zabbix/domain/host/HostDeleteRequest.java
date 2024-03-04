package com.lrsoft.starter.zabbix.domain.host;


import com.lrsoft.starter.zabbix.core.ZabbixRequest;

import java.util.ArrayList;
import java.util.List;

public class HostDeleteRequest extends ZabbixRequest {
    public HostDeleteRequest() {
        super("host.delete");
    }

    private List<String> params = new ArrayList<>();

    public void setParams(List<String> params) {
        this.params = params;
    }

    public List<String> getParams() {
        return params;
    }
}
