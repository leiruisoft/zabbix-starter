package com.lrsoft.starter.zabbix.domain.host;


import com.lrsoft.starter.zabbix.core.ZabbixRequest;
import com.lrsoft.starter.zabbix.domain.base.*;

import java.util.ArrayList;
import java.util.List;

public class HostUpdateRequest extends ZabbixRequest {

    public HostUpdateRequest() {
        super("host.update");
    }

    private HostUpdateParams params = new HostUpdateParams();

    public void setParams(HostUpdateParams params) {
        this.params = params;
    }

    public HostUpdateParams getParams() {
        return params;
    }

    public static class HostUpdateParams extends Host {
        private List<HostGroup> groups;
        private List<HostInterface> interfaces = new ArrayList<>();
        private HostInventory inventory;
        private List<Macro> macros;
        private List<Template> templates;
        private List<Template> templates_clear;

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

        public void setInventory(HostInventory inventory) {
            this.inventory = inventory;
        }

        public HostInventory getInventory() {
            return inventory;
        }

        public void setMacros(List<Macro> macros) {
            this.macros = macros;
        }

        public List<Macro> getMacros() {
            return macros;
        }

        public void setTemplates(List<Template> templates) {
            this.templates = templates;
        }

        public List<Template> getTemplates() {
            return templates;
        }

        public void setTemplates_clear(List<Template> templates_clear) {
            this.templates_clear = templates_clear;
        }

        public List<Template> getTemplates_clear() {
            return templates_clear;
        }
    }
}
