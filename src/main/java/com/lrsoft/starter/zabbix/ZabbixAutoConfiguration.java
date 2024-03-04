package com.lrsoft.starter.zabbix;

import com.lrsoft.starter.zabbix.core.ZabbixConnectionFactory;
import com.lrsoft.starter.zabbix.core.ZabbixSimpleConnectionFactory;
import com.lrsoft.starter.zabbix.core.ZabbixTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
@ConditionalOnClass({RestTemplate.class})
@EnableConfigurationProperties(ZabbixProperties.class)
public class ZabbixAutoConfiguration {

    @Autowired
    private ZabbixProperties zabbixProperties;


    @Bean
    @ConditionalOnMissingBean({ZabbixConnectionFactory.class})
    public ZabbixConnectionFactory zabbixConnectionFactory() {
        return new ZabbixSimpleConnectionFactory(new RestTemplate(), zabbixProperties);
    }


    @Bean
    @ConditionalOnMissingBean(name = {"zabbixTemplate"})
    @ConditionalOnBean({ZabbixConnectionFactory.class})
    public ZabbixTemplate zabbixTemplate(ZabbixConnectionFactory zabbixConnectionFactory) {
        return new ZabbixTemplate(zabbixConnectionFactory);
    }
}
