package com.example.microservice001user.RestTemplateVO;

import com.example.microservice001user.Model.User;

public class RestTemplateV {
    private User user;
    private Department department;


    public RestTemplateV(User user, Department department) {
        this.user = user;
        this.department = department;
    }


    public RestTemplateV() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
