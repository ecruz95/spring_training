package com.cydeo.sterotype_annotation;

import com.cydeo.sterotype_annotation.casefactory.Case;
import com.cydeo.sterotype_annotation.monitorfactory.Monitor;
import com.cydeo.sterotype_annotation.motherboardfactory.Motherboard;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt();
    }

}
