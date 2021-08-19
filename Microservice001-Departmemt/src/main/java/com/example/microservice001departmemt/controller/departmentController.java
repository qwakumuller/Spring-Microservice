package com.example.microservice001departmemt.controller;


import com.example.microservice001departmemt.model.Department;
import com.example.microservice001departmemt.service.departmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class departmentController {


    @Autowired
    private departmentService departmentservice;

    @PostMapping("/add")
    public Department first(@RequestBody Department department){
        return departmentservice.adddepartment(department);
    }
    @GetMapping("/find")
    public List<Department> second(){
        return departmentservice.findalldepartment();
    }

    @GetMapping("/{departmentID}")
    public Optional<Department> third (@PathVariable int departmentID){
        return departmentservice.findbyIdentification(departmentID);
    }
}
