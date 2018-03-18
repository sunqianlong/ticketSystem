package com.flyloong.ticketsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController extends BaseController {
    @RequestMapping(value = "/thymeleaf")
    public String  to(){
        String url=thymeleaf("/login");
        return url;
    }
}
