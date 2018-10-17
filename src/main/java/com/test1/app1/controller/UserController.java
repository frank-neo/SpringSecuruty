package com.test1.app1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String getUsers() {
        return "Hello Spring Security";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public void logincheck(){
        System.out.println("登录校验接口被调用");
    }
}