package com.kentrasoft.dao;

import com.kentrasoft.entity.User;
import com.kentrasoft.utils.plugin.PageForm;

import java.util.List;

public interface UserMapper {

    /**
     * 分业查询用户信息
     * @return
     */
    List<User> getListPage(PageForm<User> page);

    /**
     * 获取单个用户信息
     * @return
     */
    User getOne(String id);

    /**
     * 新增用户信息
     * @param user
     */
    void insert(User user);

    /**
     * 修改用户信息
     * @param user
     */
    void update(User user);

    /**
     * 删除用户信息
     * @param id
     */
    void delete(String id);
}
