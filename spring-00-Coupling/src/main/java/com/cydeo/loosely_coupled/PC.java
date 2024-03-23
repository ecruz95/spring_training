package com.cydeo.loosely_coupled;

import com.cydeo.loosely_coupled.casefactory.Case;
import com.cydeo.loosely_coupled.casefactory.DellCase;
import com.cydeo.loosely_coupled.monitorfactory.AcerMonitor;
import com.cydeo.loosely_coupled.monitorfactory.Monitor;
import com.cydeo.loosely_coupled.motherboardfactory.Motherboard;
import com.cydeo.tightly_coupled.AsusMotherboard;

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
        monitor.drawPixelAt();
    }
}
