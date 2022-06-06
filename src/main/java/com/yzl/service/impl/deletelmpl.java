package com.yzl.service.impl;

import com.yzl.dao.UserMapper;
import com.yzl.entity.msg;
import com.yzl.service.deleteService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
@MapperScan("com.yzl.dao")
public class deletelmpl implements deleteService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public msg deleteCommodity(String id) {
        Integer code = -1;
        int i = userMapper.deleteById(id);
        msg msg = new msg();
        if (i != 0){
            code = 1;
            msg.setMsg("记录删除成功");
        }
        msg.setCode(code);
        msg.setMsg("记录删除失败");
        return msg;
    }
}
