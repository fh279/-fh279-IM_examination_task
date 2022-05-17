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

    public Lorry(String marka, String carClass, int mass, Engine lorry_engine, Driver lorry_driver, int carrying) {
        super(marka, carClass, mass, lorry_engine, lorry_driver);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Printing the data fn Lorry class: " + "\n" +
                "Car brand: " + getMarka() + "\n" +
                "Car class: " + getCarClass() + "\n" +
                "Car mass, kg: " + getMass() + "\n" +
                "Car engine brand: " + getDefault_car_engine().getCompany() + "\n" +
                "The full name of the driver assigned to the Car: " + getCar_driver().getFullName() + "\n" +
                "lorry carrying, kg: " + carrying + "\n" +
                "**********";

    }
}