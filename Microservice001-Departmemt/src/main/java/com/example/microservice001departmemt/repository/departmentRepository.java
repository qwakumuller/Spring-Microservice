package com.example.microservice001departmemt.repository;

import com.example.microservice001departmemt.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface departmentRepository  extends JpaRepository<Department, Integer> {
}
