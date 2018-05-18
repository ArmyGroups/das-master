package com.kentrasoft.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys")
public class LoginController {

    //@ResponseBody
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("title", "wellcome to index");
        return "index";
    }
}
