package com.xy.springcloud.eureka;

import com.xy.springcloud.loadbalance.MyLoadBalanceRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration= MyLoadBalanceRule.class)
public class OrderEureka80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderEureka80.class, args);
    }

}
