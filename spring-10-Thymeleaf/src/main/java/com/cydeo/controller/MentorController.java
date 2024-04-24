package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MentorController {

@RequestMapping ("/mentor/register")
    public String register(){
    return "mentor/register";
}

}
