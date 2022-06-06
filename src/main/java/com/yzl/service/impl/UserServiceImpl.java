package com.yzl.service.impl;

import com.yzl.dao.UserMapper;
import com.yzl.entity.renderList;
import com.yzl.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserServiceImpl")
@MapperScan("com.yzl.dao")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<renderList> getAll() {
        List<renderList> renderList = userMapper.getRenderList();
        return renderList;
    }

}
