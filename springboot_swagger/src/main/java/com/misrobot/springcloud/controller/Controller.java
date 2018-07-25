package com.misrobot.springcloud.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String testSwagger2(@RequestBody String name){
        return "test succuss";
    }
}