package com.example.logindemo.mapper;

import com.example.logindemo.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserBean getInfo(String name, String password);

}
