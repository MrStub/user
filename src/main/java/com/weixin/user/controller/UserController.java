package com.weixin.user.controller;
import com.weixin.user.dao.UserMapper;
import com.weixin.user.model.User;
import com.weixin.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户服务
 */
@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;
    /**
     * 查询全部用户
     */
    @RequestMapping("/getUser")
    public String getUser() {
        System.out.println("已进入getUser方法");
        return userService.queryAllUser().toString();
    }

}