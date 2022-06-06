package com.yzl.service.impl;

import com.yzl.dao.UserMapper;
import com.yzl.entity.msg;
import com.yzl.entity.renderList;
import com.yzl.service.addService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@MapperScan("com.yzl.dao")
public class addServiceImpl implements addService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public msg addCommodity(renderList body) {
        msg addMsg = new msg();
        Integer count = 1;
        try {
            count = userMapper.addById(body);
        } catch (ArithmeticException e) {
            addMsg.setMsg("插入失败");
            addMsg.setCode(-1);
            return addMsg;
        }
        if (count != 0) {
            addMsg.setMsg("插入成功");
            addMsg.setCode(200);
        } else {
            addMsg.setMsg("插入失败");
            addMsg.setCode(-1);
        }
        return addMsg;
    }
}
