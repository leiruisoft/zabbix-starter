package com.lrsoft.starter.zabbix.domain.item;


import com.lrsoft.starter.zabbix.core.ZabbixRequest;
import com.lrsoft.starter.zabbix.domain.base.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemCreateRequest extends ZabbixRequest {
    public ItemCreateRequest() {
        super("item.create");
    }

    private ItemCreateParams params = new ItemCreateParams();

    public void setParams(ItemCreateParams params) {
        this.params = params;
    }

    public ItemCreateParams getParams() {
        return params;
    }

    public static class ItemCreateParams extends Item {
        private List<String> applications;

        public void setApplications(List<String> applications) {
            this.applications = applications;
        }

        public List<String> getApplications() {
            if (applications == null) {
                applications = new ArrayList<String>();
                return applications;
            }
            return applications;
        }
    }

}
