package com.xy.springcloud.eureka.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("payment/ribbon")
@Slf4j
public class PaymentRibbonController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "lb")
    public String getPaymentLB() {
        return port;
    }
}
