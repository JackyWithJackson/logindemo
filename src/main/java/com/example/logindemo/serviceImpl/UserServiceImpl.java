package com.example.logindemo.serviceImpl;

import com.example.logindemo.bean.UserBean;
import com.example.logindemo.mapper.UserMapper;
import com.example.logindemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name,password);
    }
}
