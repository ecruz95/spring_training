package com.cydeo.sterotype_annotation.motherboardfactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public abstract void loadProgram(String programName);
}
