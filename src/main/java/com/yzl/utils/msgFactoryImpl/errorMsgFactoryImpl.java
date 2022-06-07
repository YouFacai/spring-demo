package com.yzl.utils.msgFactoryImpl;

import com.yzl.entity.msg;

public class errorMsgFactoryImpl extends msgFactory{

    @Override
    public msg CreateMsg() {
        msg errorMsg = new msg();
        errorMsg.setMsg("操作失败");
        errorMsg.setMsg("-1");
        return errorMsg;
    }
}
