package com.zcp.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam(name="name") String name, Model model){
        System.out.println(1111111111);
        model.addAttribute("name",name);
        System.out.println(222222);
        return "hello";
    }
}

