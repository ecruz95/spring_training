package com.cydeo.config;

import com.cydeo.casefactory.Case;
import com.cydeo.casefactory.DellCase;
import com.cydeo.casefactory.Dimensions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;
import java.beans.BeanProperty;

@Configuration
public class PcConfig {

    public Dimensions dimensions(){
        return new Dimensions(50,10,10);
    }

    @Bean
    public Case caseDell(Dimensions dimensions){
        return new DellCase("220B", "Dell", "240", dimensions);
    }

}
