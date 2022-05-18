package com.mpogorelov.vehicles;

import com.mpogorelov.details.Engine;
import com.mpogorelov.professions.Driver;

public class SportCar extends Car {

    private Double speed;

    public SportCar(String marka, String carClass, int mass, Engine sportCarEngine, Driver truckDriver, Double speed) {
        super(marka, carClass, mass, sportCarEngine, truckDriver);
        this.speed = speed;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Printing the data of SportCar class: " + "\n" +
                "Car brand: " + getMarka() + "\n" +
                "Car class: " + getCarClass() + "\n" +
                "Car mass, kg: " + getMass() + "\n" +
                "Car engine brand: " + getDefaultCarEngine().getCompany() + "\n" +
                "The full name of the driver assigned to the Car: " + getCarDriver().getFullName() + "\n" +
                "car speed, km/h: " + getSpeed() + "\n" +
                "**********";

    }

}
