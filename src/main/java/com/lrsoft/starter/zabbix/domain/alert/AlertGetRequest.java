package com.lrsoft.starter.zabbix.domain.alert;


import com.lrsoft.starter.zabbix.core.ZabbixRequest;

import java.util.List;

public class AlertGetRequest extends ZabbixRequest {

    public AlertGetRequest() {
        super("alert.get");
    }

    private AlertGetParams params = new AlertGetParams();

    public void setParams(AlertGetParams params) {
        this.params = params;
    }

    public AlertGetParams getParams() {
        return params;
    }

    public static class AlertGetParams {
        private List<String> alertids;
        private List<String> actionids;
        private List<String> hostids;
        private List<String> sortfield;
        private String countOutput;
        private String editable;
        private String excludeSeach;
        private String limit;
        private Object output;
        private String pesevekeys;
        private String seach;
        private String seachByAny;
        private String seachWildcadsEnabled;
        private String[] sortorder;
        private String statSeach;
        private AlertFilter filter = new AlertFilter();

        public static class AlertFilter {
        }

        public List<String> getAlertids() {
            return alertids;
        }

        public void setAlertids(List<String> alertids) {
            this.alertids = alertids;
        }

        public List<String> getActionids() {
            return actionids;
        }

        public void setActionids(List<String> actionids) {
            this.actionids = actionids;
        }

        public List<String> getHostids() {
            return hostids;
        }

        public void setHostids(List<String> hostids) {
            this.hostids = hostids;
        }

        public List<String> getSortfield() {
            return sortfield;
        }

        public void setSortfield(List<String> sortfield) {
            this.sortfield = sortfield;
        }

        public String getCountOutput() {
            return countOutput;
        }

        public void setCountOutput(String countOutput) {
            this.countOutput = countOutput;
        }

        public String getEditable() {
            return editable;
        }

        public void setEditable(String editable) {
            this.editable = editable;
        }

        public String getExcludeSeach() {
            return excludeSeach;
        }

        public void setExcludeSeach(String excludeSeach) {
            this.excludeSeach = excludeSeach;
        }

        public String getLimit() {
            return limit;
        }

        public void setLimit(String limit) {
            this.limit = limit;
        }

        public Object getOutput() {
            return output;
        }

        public void setOutput(Object output) {
            this.output = output;
        }

        public String getPesevekeys() {
            return pesevekeys;
        }

        public void setPesevekeys(String pesevekeys) {
            this.pesevekeys = pesevekeys;
        }

        public String getSeach() {
            return seach;
        }

        public void setSeach(String seach) {
            this.seach = seach;
        }

        public String getSeachByAny() {
            return seachByAny;
        }

        public void setSeachByAny(String seachByAny) {
            this.seachByAny = seachByAny;
        }

        public String getSeachWildcadsEnabled() {
            return seachWildcadsEnabled;
        }

        public void setSeachWildcadsEnabled(String seachWildcadsEnabled) {
            this.seachWildcadsEnabled = seachWildcadsEnabled;
        }

        public String[] getSortorder() {
            return sortorder;
        }

        public void setSortorder(String[] sortorder) {
            this.sortorder = sortorder;
        }

        public String getStatSeach() {
            return statSeach;
        }

        public void setStatSeach(String statSeach) {
            this.statSeach = statSeach;
        }

        public AlertFilter getFilter() {
            return filter;
        }

        public void setFilter(AlertFilter filter) {
            this.filter = filter;
        }
    }
}
