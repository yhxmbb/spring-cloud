package com.xmbb.simple.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-client", fallback = EurekaFeignServiceFailure.class) // 调用的服务的名称
public interface EurekaFeignService {

    @RequestMapping(value = "/info")
    String getInfo();
}
