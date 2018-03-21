package com.flyloong.ticketsystem.controller;

import com.flyloong.ticketsystem.rpc.api.FlCityService;
import com.flyloong.ticketsystem.rpc.api.FlProvinceService;
import com.flyloong.ticketsystem.vo.PageResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class IndexController {

    /**
     *
     */
    @Autowired
    FlCityService flCityService;

    @RequestMapping(value = "/helloworld")
    @ResponseBody
    public PageResult welcome(){
        log.debug("test success.js");
        PageResult<String> pageResult=new PageResult<String>();
        pageResult.setData(null);
        pageResult.setIndex(10);
        pageResult.setTotal(1000L);
        pageResult.setTag("test");
        return pageResult;
    }
}
