package com.example.logindemo;

import com.example.logindemo.bean.UserBean;
import com.example.logindemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*编写测试类，看是否能成功 访问数据库，获取数据库信息：*/

@SpringBootTest

class LogindemoApplicationTests {
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        UserBean userBean=userService.loginIn("a","a");
        System.out.print("该用户ID为：");
        System.out.println(userBean.getId());
    }

}
