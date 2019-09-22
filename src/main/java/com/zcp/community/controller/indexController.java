package com.zcp.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class indexController {
    @GetMapping("/")
    public String index(){
        System.out.println(2);
        return "index";
    }
    @GetMapping("/index1")
    public String index1(){
System.out.println(1);
        return "/index1";
    }
}
