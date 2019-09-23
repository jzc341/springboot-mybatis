package com.etoak.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etoak.bean.User;
import com.etoak.mapper.UserMapper;
import com.etoak.service.UserService;


@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserMapper userMapper;
    
    
    public List<User> findAllUser() {
        List<User> list = userMapper.findAll();
        return list;
    }


}