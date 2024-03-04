package com.lrsoft.starter.zabbix.core;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.lrsoft.starter.zabbix.ZabbixProperties;
import com.lrsoft.starter.zabbix.domain.user.UserLoginRequest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ZabbixRestConnection implements ZabbixConnection {

    private volatile boolean initialized = false;

    private ZabbixProperties zabbixProperties;

    private RestTemplate restTemplate;

    private String authToken;

    public ZabbixRestConnection(RestTemplate restTemplate, ZabbixProperties zabbixProperties) {
        this.restTemplate = restTemplate;
        this.zabbixProperties = zabbixProperties;
    }

    /**
     * Init the connection.
     */
    @Override
    public void init() {
        if (!this.initialized) {
            String auth = zabbixProperties.getAuth();
            if (StrUtil.isBlank(zabbixProperties.getAuth())) {
                //do auth
                UserLoginRequest loginRequest = new UserLoginRequest();
                loginRequest.getParams().setUser(zabbixProperties.getUsername());
                loginRequest.getParams().setPassword(zabbixProperties.getPassword());

                JSONObject zabbixResponse = restTemplate.postForObject(this.zabbixProperties.getUrl(),
                        JSONUtil.parseObj(loginRequest),
                        JSONObject.class);
                auth = zabbixResponse.getStr("result");
            }

            if (StrUtil.isNotBlank(auth)) {
                this.authToken = auth;
                this.initialized = true;
            } else {
                throw new ZabbixException("Incorrect username or credential");
            }
        }
    }

    /**
     * Indicates whether the underlying connection is initialized or not.
     *
     * @return true if the connection is initialized, false otherwise.
     */
    @Override
    public boolean isInitialized() {
        return this.initialized;
    }

    @Override
    public ZabbixResponse execute(ZabbixRequest zabbixRequest) {
        if (StrUtil.isEmpty(zabbixRequest.getAuth())) {
            if (!this.initialized) {
                throw new ZabbixException("The connection is not initialized.");
            }

            zabbixRequest.setAuth(this.authToken);
        }

        //do rest quest
        return doPostExecute(zabbixRequest);
    }


    private ZabbixResponse doPostExecute(ZabbixRequest zabbixRequest) {
        ZabbixResponse zabbixResponse = restTemplate.postForObject(this.zabbixProperties.getUrl(),
                JSONUtil.parseObj(zabbixRequest),
                ZabbixResponse.class);
        if (null != zabbixResponse.getError()) {
            throw new ZabbixException(JSONUtil.toJsonPrettyStr(zabbixResponse.getError()));
        }

        return zabbixResponse;
    }


    private ZabbixResponse doGetExecute(ZabbixRequest zabbixRequest) {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("key1", "values");
        requestHeaders.add("key2", "ddd");
        HttpEntity<String> requestEntity = new HttpEntity<String>(null, requestHeaders);
        ResponseEntity<ZabbixResponse> response = restTemplate.exchange(this.zabbixProperties.getUrl(), HttpMethod.GET, requestEntity, ZabbixResponse.class);
        return response.getBody();
    }

    /**
     * Closes (or quits) the connection.
     *
     * @throws ZabbixException
     */
    @Override
    public void close() throws ZabbixException {
    }

    /**
     * Indicates whether the underlying connection is closed or not.
     *
     * @return true if the connection is closed, false otherwise.
     */
    @Override
    public boolean isClosed() {
        return false;
    }
}
