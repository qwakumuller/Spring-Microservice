package com.example.microservice001departmemt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Microservice001DepartmemtApplication {

    public static void main(String[] args) {
        SpringApplication.run(Microservice001DepartmemtApplication.class, args);
    }

}
