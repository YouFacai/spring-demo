package com.yzl.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class renderList implements Serializable {
    private String id;
    private String photo;
    private String Img;
    private Integer isState;
    private String stateTitle;
    private String name;
    private String explain;
    private Integer points;
    private Integer currentNum;
    private Integer maxNum;
}
