package com.flyloong.ticketsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController extends BaseController {
    @RequestMapping(value = "/")
    public String  to(){
        String url=thymeleaf("/dictionary");
        return url;
    }
    //@RequestMapping(value = "/home")
    //public String toSever(){
    //return "/pages/success.jsp";
    //}
}
