package com.xy.springcloud.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001 {

    /*
     * -Dspring.profiles.active=7001
     * -Dspring.profiles.active=7002
     * */

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001.class, args);
    }
}