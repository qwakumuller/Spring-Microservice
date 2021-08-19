package com.example.microservice001eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Microservice001EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Microservice001EurekaApplication.class, args);
    }

}
