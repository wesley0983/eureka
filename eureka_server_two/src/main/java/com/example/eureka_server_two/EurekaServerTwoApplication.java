package com.example.eureka_server_two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerTwoApplication.class, args);
    }

}
