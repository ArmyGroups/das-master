package com.kentrasoft.dao;

import com.kentrasoft.entity.Role;
import com.kentrasoft.entity.User;

import java.util.List;

public interface RoleMapper {
    /**
     * 分业查询用户信息
     * @return
     */
    List<Role> getListPage();

    /**
     * 获取单个用户信息
     * @return
     */
    Role getOne(String id);

    /**
     * 新增用户信息
     * @param role
     */
    void insert(Role role);

    /**
     * 修改用户信息
     * @param role
     */
    void update(Role role);

    /**
     * 删除用户信息
     * @param id
     */
    void delete(String id);
}
