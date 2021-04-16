package com.example.logindemo.serviceImpl;

import com.example.logindemo.bean.OrgUser;
import com.example.logindemo.mapper.OrgUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrgUserService {
    @Autowired
    OrgUserDao orgUserdao;

    public List<OrgUser> findAllList(){
        return  orgUserdao.findAllList();
    }

    public OrgUser get(String id){
        return orgUserdao.get(id);
    }

    public void add(OrgUser user){
        user.setId(UUID.randomUUID().toString().toUpperCase());
        int a=orgUserdao.add(user);
    }

    public void update(OrgUser user){
        int b=orgUserdao.update(user);
    }

    public void detele(String id){
        int c=orgUserdao.delete(id);
    }

}
