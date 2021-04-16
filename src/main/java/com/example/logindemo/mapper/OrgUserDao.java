package com.example.logindemo.mapper;

import com.example.logindemo.bean.OrgUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrgUserDao {
   List<OrgUser> findAllList();
   OrgUser get(String id);
   int add(OrgUser user);
   int update(OrgUser user);
   int delete(String id);
}
