package com.etoak.service;


import java.util.List;

import com.etoak.bean.User;




public interface UserService {
    
    /**
     * 根据接口查询所用的用户
     */
    public List<User> findAllUser();
}