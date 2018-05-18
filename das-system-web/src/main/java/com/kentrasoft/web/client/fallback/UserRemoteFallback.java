package com.kentrasoft.web.client.fallback;

import com.kentrasoft.entity.User;
import com.kentrasoft.utils.plugin.PageForm;
import com.kentrasoft.web.client.UserRemote;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRemoteFallback implements UserRemote {
    @Override
    public String hello(String name) {
        return "get error:"+name;
    }

    @Override
    public PageForm<User> getUserList(PageForm<User> page) {
        return null;
    }
}
