package com.xmbb.simple.controller;

import com.xmbb.simple.service.EurekaFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EurekaFeignController {

    @Resource
    private EurekaFeignService eurekaFeignService;

    @GetMapping("/feignInfo")
    public String feignInfo() {
        String message = eurekaFeignService.getInfo();
        return "获取到的信息:" + message;
    }
}
