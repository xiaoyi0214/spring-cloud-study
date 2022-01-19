package com.xy.springcloud.zk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class PaymentZk8001 {

    /**
     * zookeeper 注册内容：
     * [zk: localhost:2181(CONNECTED) 8] get /services/cloud-payment-service-zookeeper/3bf1973a-7d6e-42b9-a9a1-049ca7e132b7
     * {"name":"cloud-payment-service","id":"3bf1973a-7d6e-42b9-a9a1-049ca7e132b7","address":"xiaoyi","port":8004,"sslPort":null,"payload":{"@class":"org.springframework.cloud.zookeeper.discovery.ZookeeperInstance","id":"application-1","name":"cloud-payment-service-zookeeper","metadata":{}},"registrationTimeUTC":1642376683503,"serviceType":"DYNAMIC","uriSpec":{"parts":[{"value":"scheme","variable":true},{"value":"://","variable":false},{"value":"address","variable":true},{"value":":","variable":false},{"value":"port","variable":true}]}}
     *
     *
     * */

    public static void main(String[] args) {
        SpringApplication.run(PaymentZk8001.class, args);
    }
}
