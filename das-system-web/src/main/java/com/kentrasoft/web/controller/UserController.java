package com.kentrasoft.web.controller;

import com.kentrasoft.entity.User;
import com.kentrasoft.utils.plugin.PageForm;
import com.kentrasoft.web.client.UserRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    private UserRemote userRemote;
    @RequestMapping("/index")
    public String index(Model model){
        //model.addAttribute("title", "wellcome to index");
        return "system/user/user_list";
    }
    @RequestMapping("/list")
    @ResponseBody
    public PageForm<User> list(Model model,PageForm<User> page){
        return userRemote.getUserList(page);
    }

}
