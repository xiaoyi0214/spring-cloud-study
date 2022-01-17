package com.xy.springcloud.zk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class PaymentZk8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentZk8001.class, args);
    }
}
