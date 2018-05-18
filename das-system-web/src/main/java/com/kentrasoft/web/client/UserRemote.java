package com.kentrasoft.web.client;

import com.kentrasoft.entity.User;
import com.kentrasoft.utils.plugin.PageForm;
import com.kentrasoft.web.client.fallback.UserRemoteFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name= "das-system-api" , fallback=UserRemoteFallback.class)
public interface UserRemote{
    @RequestMapping(value = "/user/hello")
    public String hello(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/user/list")
    public PageForm<User> getUserList(PageForm<User> page);
}
