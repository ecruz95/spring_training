package com.cydeo.bean_annotation.config;
import org.springframework.context.annotation.Configuration;

import javax.management.monitor.Monitor;

@Configuration //These are known as annotations

public class ComputerConfig {

    public SonyMonitor monitorSony(){
        return new SonyMonitor(); //Monitor abc = new SonyMonitor();
    }

}
