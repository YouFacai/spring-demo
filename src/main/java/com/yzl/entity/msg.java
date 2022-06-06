package com.yzl.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class msg implements Serializable {
    private Integer code;
    private String msg;

}
