package com.xy.springcloud.eureka.controller;



import com.xy.springcloud.entities.CommonResult;
import com.xy.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer/payment")
public class OrderEurekaController {

    // local本地直接调用
    public static final String PaymentSrv_URL = "http://localhost:8001";

    // Eureka
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    //

    @Autowired
    private RestTemplate restTemplate;


    /*@Autowired
    private RestOperations restTemplate;*/

    @GetMapping("create") //客户端用浏览器是get请求，但是底层实质发送post调用服务端8001
    public CommonResult create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }


    @GetMapping("get/{id}")
    public CommonResult getPayment(@PathVariable Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class, id);
    }

}
