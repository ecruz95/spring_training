package com.cydeo.sterotype_annotation.monitorfactory;

import org.springframework.stereotype.Component;

@Component
public class SonyMonitor extends Monitor{

    public SonyMonitor(){super("25 inch beast", "Sony", 25);}

    public void drawPixelAt() {
        System.out.println("Drawing pixed with Sony");
    }
}
