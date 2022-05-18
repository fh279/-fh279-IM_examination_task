package com.mpogorelov.vehicles;

import com.mpogorelov.details.Engine;
import com.mpogorelov.professions.Driver;

public class Car {
    // Поля, данные исходным заданием
    private String marka;
    private String carClass;
    private int mass; // это есть в описании, но нет в схеме.
    private Engine defaultCarEngine;
    private Driver carDriver;

    // Конструктор для наследования дочерними классами
    public Car(String marka, String carClass, int mass, Engine defaultCarEngine, Driver carDriver) {
        this.carClass = carClass;
        this.mass = mass;
        this.defaultCarEngine = defaultCarEngine;
        this.carDriver = carDriver;
        this.marka = marka;
    }

    // Геттеры
    public String getMarka() {
        return marka;
    }

    public String getCarClass() {
        return carClass;
    }

    public int getMass() {
        return mass;
    }

    public Engine getDefaultCarEngine() {
        return defaultCarEngine;
    }

    public Driver getCarDriver() {
        return carDriver;
    }

    // Сеттеры. Завел их ради приличия.
    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public void setDefaultCarEngine(Engine defaultCarEngine) {
        this.defaultCarEngine = defaultCarEngine;
    }

    public void setCarDriver(Driver carDriver) {
        this.carDriver = carDriver;
    }

    // Методы по заданию. Не стал их выводить на печать, потому что... ну серьезно?..)
    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот налево");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Printing the data of Car class: " + "\n" +
                "Car brand: " + marka + "\n" +
                "Car class: " + carClass + "\n" +
                "Car mass, kg: " + mass + "\n" +
                "Car engine brand: " + defaultCarEngine.getCompany() + "\n" +
                "The full name of the driver assigned to the Car: " + carDriver.getFullName() + "\n" +
                "**********";
    }
}