package com.flyloong.ticketsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController extends BaseController {
    @RequestMapping(value = "/index")
    public String  to(){
        String url=thymeleaf("/index");
        return url;
    }
    //@RequestMapping(value = "/home")
    //public String toSever(){
    //return "/pages/success.jsp";
    //}
}
