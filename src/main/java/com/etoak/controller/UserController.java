package com.etoak.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etoak.bean.User;
import com.etoak.service.UserService;



@RestController/**自动返回的是json格式数据***/
public class UserController {
    
    @Autowired
    private UserService userService;

    @RequestMapping("list")//http://localhost:8080/list
    public List<User> list(){
        List<User> list = userService.findAllUser();
        return list;
    }
}