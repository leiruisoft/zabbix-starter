package com.lrsoft.starter.zabbix.core;

public interface ZabbixCallback<T> {

    /**
     * Gets called by {@link ZabbixTemplate} with an active Zabbix connection. Does not need to care about activating or
     * closing the connection or handling exceptions.
     *
     * @param connection active Zabbix connection
     * @return a result object or {@code null} if none
     * @throws
     */
    T doInZabbix(ZabbixConnection connection);

}
