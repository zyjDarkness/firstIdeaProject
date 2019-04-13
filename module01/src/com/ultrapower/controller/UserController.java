package com.ultrapower.controller;


import com.ultrapower.service.com.ultrapower.service.UserService;
import com.ultrapower.service.com.ultrapower.service.impl.UserServiceImpl;

/**
 * @auther zhangYunjiao
 * @date 2019/4/12 - 21:24
 */
public class UserController {

    UserService userService = new UserServiceImpl();

    public void getUserInfo() {
        userService.getUserInfo();
        System.out.println("测试。。。");
    }

    public void getUserInfoById() {
        userService.getUserInfoById(2);
        userService.getUserInfo();
    }

}
