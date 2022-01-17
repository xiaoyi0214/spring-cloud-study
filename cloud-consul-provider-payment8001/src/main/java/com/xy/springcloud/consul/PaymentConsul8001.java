package com.xy.springcloud.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsul8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsul8001.class, args);
    }
}
