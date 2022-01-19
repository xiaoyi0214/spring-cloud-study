package com.xy.springcloud.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001 {

    /**
     * 单机版：
     *      -Dspring.profiles.active=self7001
     *
     * 集群版：
     *      -Dspring.profiles.active=ek7001
     *      -Dspring.profiles.active=ek7002
     * */

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001.class, args);
    }
}
