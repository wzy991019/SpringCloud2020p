package com.wang.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    //RestTemplate来进行端口映射
    @Bean//容器注入
//    @LoadBalanced//负载均衡    默认规则为：轮询
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
//application.xml  <bean id="" class="">