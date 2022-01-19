package com.xy.springcloud.eureka;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude={DruidDataSourceAutoConfigure.class})
@EnableEurekaClient
public class PaymentEureka8001 {
    /**
     * 集群启动参数：
     *       -Dspring.profiles.active=ek8001
     *       -Dspring.profiles.active=ek8002
     * */

    public static void main(String[] args) {
        SpringApplication.run(PaymentEureka8001.class, args);
    }

}
