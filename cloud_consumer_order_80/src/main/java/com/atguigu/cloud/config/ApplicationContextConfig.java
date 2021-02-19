package com.atguigu.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ycc
 * @created 2021/2/19 12:31
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    // 开启RestTemplate的负载均衡功能
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
