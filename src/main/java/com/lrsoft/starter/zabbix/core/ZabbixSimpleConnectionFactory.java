package com.lrsoft.starter.zabbix.core;

import com.lrsoft.starter.zabbix.ZabbixProperties;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZabbixSimpleConnectionFactory implements InitializingBean, DisposableBean, ZabbixConnectionFactory {

    private RestTemplate restTemplate;
    private ZabbixProperties zabbixProperties;

    public ZabbixSimpleConnectionFactory(RestTemplate restTemplate, ZabbixProperties zabbixProperties) {
        this.restTemplate = restTemplate;
        this.zabbixProperties = zabbixProperties;
    }

    @Override
    public ZabbixConnection getConnection() {
        ZabbixRestConnection result = new ZabbixRestConnection(restTemplate, zabbixProperties);
        postProcessConnection(result);
        return result;
    }

    protected ZabbixConnection postProcessConnection(ZabbixRestConnection connection) {
        connection.init();
        return connection;
    }

    /**
     * Invoked by a BeanFactory on destruction of a singleton.
     *
     * @throws Exception in case of shutdown errors.
     *                   Exceptions will get logged but not rethrown to allow
     *                   other beans to release their resources too.
     */
    @Override
    public void destroy() throws Exception {

    }

    /**
     * Invoked by a BeanFactory after it has set all bean properties supplied
     * (and satisfied BeanFactoryAware and ApplicationContextAware).
     * <p>This method allows the bean instance to perform initialization only
     * possible when all bean properties have been set and to throw an
     * exception in the event of misconfiguration.
     *
     * @throws Exception in the event of misconfiguration (such
     *                   as failure to set an essential property) or if initialization fails.
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(this.zabbixProperties);
        Assert.hasText(this.zabbixProperties.getUrl());
        Assert.hasText(this.zabbixProperties.getUsername());
        Assert.hasText(this.zabbixProperties.getPassword());
        Assert.notNull(this.restTemplate);

        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        //Add the Jackson Message converter
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        // Note: here we are making this converter to process any kind of response,
        // not only application/*json, which is the default behaviour
        converter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON_UTF8, MediaType.TEXT_HTML));
        messageConverters.add(converter);
        restTemplate.setMessageConverters(messageConverters);

//        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
//        restTemplate.setInterceptors(Collections.singletonList(new RestTemplateHeaderInterceptor()));
    }
}
