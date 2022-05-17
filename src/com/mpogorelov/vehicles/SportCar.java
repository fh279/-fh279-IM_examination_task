package com.mpogorelov.vehicles;

import com.mpogorelov.details.Engine;
import com.mpogorelov.professions.Driver;

public class SportCar extends Car {

    private Double speed;

    public SportCar(String marka, String carClass, int mass, Engine sportCar_engine, Driver truck_driver, Double speed) {
        super(marka, carClass, mass, sportCar_engine, truck_driver);
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
                "Car engine brand: " + getDefault_car_engine().getCompany() + "\n" +
                "The full name of the driver assigned to the Car: " + getCar_driver().getFullName() + "\n" +
                "car speed, km/h: " + getSpeed() + "\n" +
                "**********";

    }

}
