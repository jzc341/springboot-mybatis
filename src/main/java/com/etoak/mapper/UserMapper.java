package com.etoak.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.etoak.bean.User;



@Mapper
public interface UserMapper {
    
    public List<User> findAll();

}