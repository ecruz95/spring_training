package com.cydeo.motherboardfactory;

public class AsusMotherboard extends Motherboard{

    public AsusMotherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios){
        super(model, manufacturer, ramSlots, cardSlots, bios);
    }

    public void loadProgram(String progamName){
        System.out.println("Program " + progamName + " is now loading...");
    }

}
