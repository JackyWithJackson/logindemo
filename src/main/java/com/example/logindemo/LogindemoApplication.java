package com.example.logindemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//项目启动类要添加注解@MapperScan项目启动时扫描mapper接口，否则会报错找不到mapper文件
@MapperScan("com.example.logindemo.mapper")
public class LogindemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogindemoApplication.class, args);
        System.out.println("启动成功！！！");
    }

}
