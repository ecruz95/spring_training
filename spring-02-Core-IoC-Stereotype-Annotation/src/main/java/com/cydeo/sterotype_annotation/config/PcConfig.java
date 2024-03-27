package com.cydeo.sterotype_annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.cydeo") //will search for components in all classes within package com.cydeo
public class PcConfig {

}
