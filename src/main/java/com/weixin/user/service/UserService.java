package com.weixin.user.service;

import com.weixin.user.dao.UserMapper;
import com.weixin.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> queryAllUser(){
        System.out.println("已进入queryAllUser方法");
        return userMapper.queryAllUser();
    }
}
