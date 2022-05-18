package com.mpogorelov.vehicles;

import com.mpogorelov.details.Engine;
import com.mpogorelov.professions.Driver;

public class Lorry extends Car {
    int carrying;

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public Lorry(String marka, String carClass, int mass, Engine lorryEngine, Driver lorryDriver, int carrying) {
        super(marka, carClass, mass, lorryEngine, lorryDriver);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Printing the data fn Lorry class: " + "\n" +
                "Car brand: " + getMarka() + "\n" +
                "Car class: " + getCarClass() + "\n" +
                "Car mass, kg: " + getMass() + "\n" +
                "Car engine brand: " + getDefaultCarEngine().getCompany() + "\n" +
                "The full name of the driver assigned to the Car: " + getCarDriver().getFullName() + "\n" +
                "lorry carrying, kg: " + carrying + "\n" +
                "**********";

    }
}