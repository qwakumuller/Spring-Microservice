package com.example.microservice001apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class Microservice001ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(Microservice001ApiGatewayApplication.class, args);
    }

}
