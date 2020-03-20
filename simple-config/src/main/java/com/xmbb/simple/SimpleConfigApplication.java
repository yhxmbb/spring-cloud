package com.xmbb.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class SimpleConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleConfigApplication.class, args);
    }

}
