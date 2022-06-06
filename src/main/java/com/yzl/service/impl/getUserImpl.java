package com.yzl.service.impl;

import com.yzl.dao.UserMapper;
import com.yzl.entity.renderList;
import com.yzl.service.getUserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@MapperScan("com.yzl.dao")
public class getUserImpl implements getUserService {
    @Autowired
    private UserMapper userMapper;

    public renderList getUser(String id){
        renderList user = userMapper.getUser(id);
        System.out.println(id);
        return  user;
    }
}
