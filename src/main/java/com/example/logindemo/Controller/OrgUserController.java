package com.example.logindemo.Controller;

import com.example.logindemo.bean.OrgUser;
import com.example.logindemo.serviceImpl.OrgUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class OrgUserController {

    @Autowired
    OrgUserService orgUserService;

    @RequestMapping("/list")
    public String list(Model model){
        List<OrgUser> userList=orgUserService.findAllList();
        model.addAttribute(userList);
        return "/user_list";
    }

    //列表页面点击 添加 跳转添加页面
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "/user_add";
    }
    //添加 完成跳转列表页面
    @RequestMapping("/add")
    public String add(OrgUser user){
        orgUserService.add(user);
        return "/list";
    }


    //列表页面点击修改 跳转修改页面并需要回显信息
    @RequestMapping("/toUpdate")
    public String toUpdate(String id,Model model){
        OrgUser user=orgUserService.get(id);
        model.addAttribute(user);
        return "/user_update";
    }

    //修改 完成后跳至列表页面
    @RequestMapping("/update")
    public String update(OrgUser user){
        orgUserService.update(user);
        return "redirect:/list";
    }

    //删除 完成后跳至列表页面
    @RequestMapping("/delete")
    public String delete(String id){
        orgUserService.detele(id);
        return "redirect:/list";
    }


}
