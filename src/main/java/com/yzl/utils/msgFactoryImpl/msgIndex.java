package com.yzl.utils.msgFactoryImpl;

import com.yzl.entity.msg;

public class msgIndex {
    public static msgFactory createMsg(Integer code) {
        if (code == 200) {
            return new successMsgFactoryImpl();
        }else{
            return new errorMsgFactoryImpl();
        }
    }
}