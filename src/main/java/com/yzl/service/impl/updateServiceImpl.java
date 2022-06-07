package com.yzl.service.impl;

import com.yzl.dao.UserMapper;
import com.yzl.entity.msg;
import com.yzl.entity.renderList;
import com.yzl.service.updateService;
import com.yzl.utils.msgFactoryImpl.msgFactory;
import com.yzl.utils.msgFactoryImpl.msgIndex;
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
        count = count == 0 ? -1 : 200;
        msgFactory Msg = msgIndex.createMsg(count);
        msg msgData = Msg.CreateMsg();
        return  msgData;
    }
}
