package com.lrsoft.starter.zabbix.core;


public interface ZabbixConnection {


    /**
     * Init the connection.
     */
    void init();

    /**
     * Indicates whether the underlying connection is initialized or not.
     *
     * @return true if the connection is initialized, false otherwise.
     */
    boolean isInitialized();

    /**
     * execute request zabbix
     *
     * @param zabbixRequest
     * @return
     */
    ZabbixResponse execute(ZabbixRequest zabbixRequest);

    /**
     * Closes (or quits) the connection.
     */
    void close() throws ZabbixException;

    /**
     * Indicates whether the underlying connection is closed or not.
     *
     * @return true if the connection is closed, false otherwise.
     */
    boolean isClosed();
}
