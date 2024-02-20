package com.example.Transaction.controller;


import com.example.Transaction.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.example.Transaction.service.UserService;

@RestController
@RequestMapping("")
public class UserController{

    @Autowired
    private UserService userService;




    @RequestMapping("/create")
    @PostMapping
    public String createUser(@RequestBody @Validated User user){
        return userService.createUser(user);
    }
}
