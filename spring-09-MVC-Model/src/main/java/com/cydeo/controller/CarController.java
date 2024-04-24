package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

    //localhost:8080/info?make=Honda
    @RequestMapping("/info")
    public String carInfo(@RequestParam String make, Model model){

        model.addAttribute("make", make);
        System.out.println(make);

        return "car/car-info";
    }

    //localhost:8080/info2 (KIA)
    @RequestMapping("/info2")
    public String carInfo2(@RequestParam(value = "make", required = false, defaultValue = "BMW") String make, Model model){

        model.addAttribute("make", make);
        System.out.println(make);

        return "car/car-info";
    }

    @RequestMapping("/info3")
    public String carInfo3(@RequestParam String make, @RequestParam int year, Model model){ //localhost:8080/info3?make=Honda&year=2015

        model.addAttribute("make", make);
        model.addAttribute("year", year);
        System.out.println(make);

        return "car/car-info";
    }

    @RequestMapping("/info/{make}")  //localhost:8080/info/honda
    public String getCarInfo(@PathVariable String make){

        System.out.println(make);
        //honda
        return "car/car-info";
    }
}
