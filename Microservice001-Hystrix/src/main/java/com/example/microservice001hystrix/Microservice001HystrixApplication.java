package com.example.microservice001hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class Microservice001HystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(Microservice001HystrixApplication.class, args);
    }

}
