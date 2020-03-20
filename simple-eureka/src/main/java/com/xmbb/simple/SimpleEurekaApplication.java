package com.xmbb.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SimpleEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleEurekaApplication.class, args);
    }

}
