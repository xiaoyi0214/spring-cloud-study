package com.xy.springcloud.zkpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class ZkPayment8001 {

    public static void main(String[] args) {
        SpringApplication.run(ZkPayment8001.class, args);
    }
}
