package com.kentrasoft.controller;

import com.kentrasoft.dao.UserMapper;
import com.kentrasoft.entity.User;
import com.kentrasoft.utils.plugin.PageForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Null;
import java.util.List;


@RefreshScope
@RestController
@RequestMapping("/user")
public class UserController{
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/hello")
    public String hello(String name) {
        return userMapper.getOne("1").getUserName();
    }

    @RequestMapping(value = "/list")
    public PageForm<User> getUserList(PageForm<User> page){
        page.setData(userMapper.getListPage(page));
        return page;
    }
}
