package com.example.logindemo.Controller;

import com.example.logindemo.bean.UserBean;
import com.example.logindemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    //将Service注入Web层
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "/login";
    }

    @RequestMapping(value="/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
       UserBean userbean=userService.loginIn(name,password);
       if(userbean!=null){
           return "/success";
       }else{
           return "/error";
       }

    }

}
