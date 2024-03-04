package com.lrsoft.starter.zabbix.domain.item;


import com.lrsoft.starter.zabbix.core.ZabbixRequest;
import com.lrsoft.starter.zabbix.domain.base.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemUpdateRequest extends ZabbixRequest {
    public ItemUpdateRequest() {
        super("item.update");
    }

    private ItemUpdateParams params = new ItemUpdateParams();

    public void setParams(ItemUpdateParams params) {
        this.params = params;
    }

    public ItemUpdateParams getParams() {
        return params;
    }

    public static class ItemUpdateParams extends Item {
        private List<Item> applications;

        public void setApplications(List<Item> applications) {
            this.applications = applications;
        }

        public List<Item> getApplications() {
            if (applications == null) {
                applications = new ArrayList<>();
                return applications;
            }
            return applications;
        }
    }
}
