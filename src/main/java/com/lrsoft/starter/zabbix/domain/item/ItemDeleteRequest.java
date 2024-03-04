package com.lrsoft.starter.zabbix.domain.item;


import com.lrsoft.starter.zabbix.core.ZabbixRequest;

import java.util.ArrayList;
import java.util.List;

public class ItemDeleteRequest extends ZabbixRequest {
    public ItemDeleteRequest() {
        super("item.delete");
    }

    private List<String> params;

    public void setParams(List<String> params) {
        this.params = params;
    }

    public List<String> getParams() {
        if (params == null) {
            params = new ArrayList<>();
            return params;
        }
        return params;
    }

}
