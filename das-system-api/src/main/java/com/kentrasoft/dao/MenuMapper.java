package com.kentrasoft.dao;

import com.kentrasoft.entity.Menu;

import java.util.List;

public interface MenuMapper {
    /**
     * 分业查询用户信息
     * @return
     */
    List<Menu> getListPage();

    /**
     * 获取单个用户信息
     * @return
     */
    Menu getOne(String id);

    /**
     * 新增用户信息
     * @param menu
     */
    void insert(Menu menu);

    /**
     * 修改用户信息
     * @param menu
     */
    void update(Menu menu);

    /**
     * 删除用户信息
     * @param id
     */
    void delete(String id);
}
