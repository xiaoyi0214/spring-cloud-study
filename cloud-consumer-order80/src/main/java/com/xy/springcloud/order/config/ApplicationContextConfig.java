package com.xy.springcloud.order.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {


    @Bean
    @LoadBalanced  // 负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /*@Bean
    @LoadBalanced  // 负载均衡
    RestOperations restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }*/

}
