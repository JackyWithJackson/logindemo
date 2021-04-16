package com.example.logindemo.service;

import com.example.logindemo.bean.UserBean;

public interface UserService {

    UserBean loginIn(String name, String password);
}
