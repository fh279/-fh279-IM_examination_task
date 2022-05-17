package com.mpogorelov.vehicles;
import com.mpogorelov.details.Engine;
import com.mpogorelov.professions.Driver;

public class Car {
    // Изначально заданные поля
    private String marka;
    private String carClass;
    private int mass; // это есть в описании, но нет в схеме.
    private Engine default_car_engine;
    private Driver car_driver;

    // Конструктор для наследования дочерними классами
    public Car (String marka, String carClass, int mass, Engine default_car_engine, Driver car_driver) {
        this.carClass = carClass;
        this.mass = mass;
        this.default_car_engine = default_car_engine;
        this.car_driver = car_driver;
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }
    public String getCarClass() {
        return carClass;
    }
    public int getMass() {
        return mass;
    }
    public Engine getDefault_car_engine() {
        return default_car_engine;
    }
    public Driver getCar_driver() {
        return car_driver;
    }

    // сеттеры
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }
    public void setMass(int mass) {
        this.mass = mass;
    }
    public void setDefault_car_engine(Engine default_car_engine) {
        this.default_car_engine = default_car_engine;
    }
    public void setCar_driver(Driver car_driver) {
        this.car_driver = car_driver;
    }

    // методы по заданию
    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот налево");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car brand: " + marka + "\n" +
                "Car class: " + carClass + "\n" +
                "Car mass, kg: " + mass + "\n" +
                "Car engine brand: " + default_car_engine.getCompany() + "\n" +
                "The full name of the driver assigned to the Car: " + car_driver.getFullName();
    }
}