package com.yzl.dao;

import com.yzl.entity.renderList;

import java.util.List;

public interface UserMapper {
    List<renderList> getRenderList();
    int deleteById(String id);
    int addById(renderList body);
    int updateId(renderList body);
    renderList getUser(String id);
}
