/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.serviceA;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Nouman Ahmed
 */
@RestController
@Slf4j
@RequestMapping("/service")
public class TestController {

    @Value("${service.b.url}")
    private String serviceBUrl;

    @Value("${service.c.url}")
    private String serviceCUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/b")
    public String callServiceA() {
        log.info("service b url : {}", serviceBUrl);
        return restTemplate.getForObject(serviceBUrl, String.class);
    }

    @GetMapping("/c")
    public String callServiceB() {
        log.info("Service c url : {}", serviceCUrl);
        return restTemplate.getForObject(serviceCUrl, String.class);
    }
}
