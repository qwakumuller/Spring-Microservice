package com.example.microservice001user.Controller;

import com.example.microservice001user.Model.User;
import com.example.microservice001user.RestTemplateVO.RestTemplateV;
import com.example.microservice001user.Service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {


    @Autowired
    private userService userservice;


    @PostMapping("/add")
    public User first(@RequestBody User user){
        return userservice.adduser(user);
    }

    @GetMapping("/find")
    public List<User> second(){
        return  userservice.findallUser();
    }

    @GetMapping("/{id}")
  public RestTemplateV third(@PathVariable("id") int userID){
        return userservice.getUserwithDepartment(userID);
    }
}
