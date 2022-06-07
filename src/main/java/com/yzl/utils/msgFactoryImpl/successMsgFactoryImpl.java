package com.yzl.utils.msgFactoryImpl;

import com.yzl.entity.msg;

public class successMsgFactoryImpl extends msgFactory {

    @Override
    public msg CreateMsg(){
        msg successMsg = new msg();
        successMsg.setMsg("操作成功");
        successMsg.setCode(200);
        return successMsg;
    }
}
