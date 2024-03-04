package com.lrsoft.starter.zabbix.domain.host;


import com.lrsoft.starter.zabbix.core.ZabbixRequest;
import com.lrsoft.starter.zabbix.domain.base.*;

import java.util.ArrayList;
import java.util.List;

public class HostCreateRequest extends ZabbixRequest {
    public HostCreateRequest() {
        super("host.create");
    }

    private HostCreateParams params = new HostCreateParams();

    public void setParams(HostCreateParams params) {
        this.params = params;
    }

    public HostCreateParams getParams() {
        return params;
    }

    public static class HostCreateParams extends Host {
        private List<HostGroup> groups = new ArrayList<>();
        private List<HostInterface> interfaces = new ArrayList<>();
        private List<Template> templates = new ArrayList<>();
        private List<Macro> macros;
        private HostInventory inventory;

        public void setGroups(List<HostGroup> groups) {
            this.groups = groups;
        }

        public List<HostGroup> getGroups() {
            return groups;
        }

        public void setInterfaces(List<HostInterface> interfaces) {
            this.interfaces = interfaces;
        }

        public List<HostInterface> getInterfaces() {
            return interfaces;
        }

        public void setTemplates(List<Template> templates) {
            this.templates = templates;
        }

        public List<Template> getTemplates() {
            if (templates == null) {
                templates = new ArrayList<>();
                return templates;
            }
            return templates;
        }

        public void setMacros(List<Macro> macros) {
            this.macros = macros;
        }

        public List<Macro> getMacros() {
            return macros;
        }

        public void setInventory(HostInventory inventory) {
            this.inventory = inventory;
        }

        public HostInventory getInventory() {
            return inventory;
        }
    }
}
