package com.flyloong.ticketsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping(value = "/helloworld")
    @ResponseBody
    public String welcome(){
        return "success.jsp";
    }
}
