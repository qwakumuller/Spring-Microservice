package com.example.microservice001user.Service;

import com.example.microservice001user.Model.User;
import com.example.microservice001user.Repository.userRepository;
import com.example.microservice001user.RestTemplateVO.Department;
import com.example.microservice001user.RestTemplateVO.RestTemplateV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class userService {

    @Autowired
    private userRepository userrepository;

    @Autowired
    private RestTemplate restTemplate;


    public User adduser(User user){
        return userrepository.save(user);
    }

    public List<User> findallUser(){
        return userrepository.findAll();
    }

    public RestTemplateV getUserwithDepartment(int userID){
        RestTemplateV vo = new RestTemplateV();
        User user = userrepository.findByuserID(userID);
        Department department= restTemplate.getForObject("http://DEPARTMENT/department/" + user.getDepartmentID()
                , Department.class);
        vo.setDepartment(department);
        vo.setUser(user);
        return vo;
    }
}
