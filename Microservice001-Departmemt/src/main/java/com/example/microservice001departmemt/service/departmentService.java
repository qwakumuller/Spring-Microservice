package com.example.microservice001departmemt.service;

import com.example.microservice001departmemt.model.Department;
import com.example.microservice001departmemt.repository.departmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class departmentService {

    @Autowired
    private departmentRepository departmentrepository;


    public Department adddepartment(Department department){
        return departmentrepository.save(department);
    }

    public List<Department> findalldepartment(){
        return  departmentrepository.findAll();
    }

    public Optional<Department> findbyIdentification(int departmentID){
        return departmentrepository.findById(departmentID);
    }

}

