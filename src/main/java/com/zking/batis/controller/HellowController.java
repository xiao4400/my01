package com.zking.batis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class HellowController {


    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello");
        return "a";
    }

}
