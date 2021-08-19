package com.example.microservice001apigateway;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/userfallback")
    public String UserfirstfallBack(){
        return "User Service is taken longer than expected";
    }

    @GetMapping("departmentfallback")
    public String DepartmentfallBack(){
        return  " Department Service is taken longer than expected";
    }
}
