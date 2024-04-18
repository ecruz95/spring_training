package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        return "home.html";
    }

    @RequestMapping("/edward")
    public String getHomePage2(){
        return"home.html";
    }

    //For the default
    @RequestMapping({"/apple", "/orange"})
    public String getHomePage3(){
        return "home.html";
    }


}
