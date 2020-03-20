package com.xmbb.simple.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RefreshScope
public class ProviderController {
    @Value("${server.port}")
    private String port;
    @Value("${info}")
    private String info;

    @RequestMapping("/port")
    public String port(HttpServletRequest request){
        String msg = request.getScheme() + "://"+ request.getServerName() + ":"+ request.getServerPort() + request.getServletPath();
        return msg;
    }

    @RequestMapping("/info")
    public String info(HttpServletRequest request){
        return info;
    }

}
