package com.cydeo.controller;

import com.cydeo.boostrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

    //when we create controller class, we are going to look for endpoints

    @GetMapping("/register") //locathost:8080/student/register
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register";
    }

    @RequestMapping("/welcome")  //localhost:8080/student/welcome?name=Edward
    public String welcome(@RequestParam String name){
        System.out.println(name);
        return "student/welcome";
    }
}
