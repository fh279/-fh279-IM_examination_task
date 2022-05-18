package com.mpogorelov;

import com.mpogorelov.details.Engine;
import com.mpogorelov.professions.Driver;
import com.mpogorelov.vehicles.Car;
import com.mpogorelov.vehicles.Lorry;
import com.mpogorelov.vehicles.SportCar;

public class Main {

    public static void main(String[] args) {

        // Source task: https://www.examclouds.com/ru/java/java-core-russian/lesson7-tasks (task #6)

        Engine defaultEngine = new Engine(1, "Default company");
        Driver defaultDriver = new Driver("Default name", 1, 1);

        Engine lorryEngine = new Engine(1000, "Tatra Motors");
        Driver lorryDriver = new Driver("Lorry Driver", 52, 30);

        Engine sportCarEngine = new Engine(800, "Ferrari motors");
        Driver sportCarDriver = new Driver("Sport Car Driver", 35, 15);

        Car defaultCar = new Car("isn't defined", "isn't defined", 1, defaultEngine, defaultDriver);

        Lorry lorry = new Lorry("Tatra", "Heavy Vehicle", 8000, lorryEngine, lorryDriver, lorryDriver.getExperience());
        SportCar sportCar = new SportCar("Ferrari", "Sport Car", 900, sportCarEngine, sportCarDriver, 100500.);

        System.out.println(defaultCar);
        System.out.println(lorry);
        System.out.println(sportCar);

    }

}