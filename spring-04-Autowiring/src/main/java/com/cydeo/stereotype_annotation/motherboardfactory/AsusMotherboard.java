package com.cydeo.stereotype_annotation.motherboardfactory;

import org.springframework.stereotype.Component;

@Component
public class AsusMotherboard extends Motherboard{

    public AsusMotherboard(){
        super("BJ-200", "Asus", 4, 8, "v2.44");
    }

    public void loadProgram(String progamName){
        System.out.println("Program " + progamName + " is now loading...");
    }
}
