package com.example.eureka_server_one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerOneApplication.class, args);
    }

}
