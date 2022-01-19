package com.xy.springcloud.eureka.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextBean {


    @Bean
    @LoadBalanced  // 负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean(name = "noLoadBalanceRestTemplate")
    public RestTemplate noLoadBalanceRestTemplate() {
        return new RestTemplate();
    }

}
