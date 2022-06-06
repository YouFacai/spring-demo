package com.yzl.service.impl;

import com.yzl.dao.UserMapper;
import com.yzl.entity.msg;
import com.yzl.entity.renderList;
import com.yzl.service.updateService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@MapperScan("com.yzl.dao")
public class updateServiceImpl implements updateService {

    @Autowired
    private com.yzl.dao.UserMapper UserMapper;

    public msg update(renderList body) {
        Integer count = UserMapper.updateId(body);
        msg msg = new msg();
        if (count == 0) {
            msg.setMsg("修改失败");
            msg.setCode(-1);
        } else {
            msg.setMsg("修改成功");
            msg.setCode(200);
        }
        return msg;
    }
}
