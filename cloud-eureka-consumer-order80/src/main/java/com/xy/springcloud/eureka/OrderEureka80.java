package com.xy.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class OrderEureka80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderEureka80.class, args);
    }

}
