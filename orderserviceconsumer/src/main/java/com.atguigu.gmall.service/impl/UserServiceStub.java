package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @program: dubbo_project
 * @description: ${description}
 * @author: Mr.Wang
 * @create: 2019-11-23 22:57
 **/
public class UserServiceStub implements UserService {
    private final UserService userService;

    /**
     * 传入的是userService的代理对象
     * @param userService
     */
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("调用了本地存根");
        if(!StringUtils.isEmpty(userId)){
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
