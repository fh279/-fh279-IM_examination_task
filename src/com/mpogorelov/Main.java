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
        Driver defaultDriver = new Driver("Default name", 1);

        Engine lorry_engine = new Engine(1000, "Tatra Motors");
        Driver lorry_driver = new Driver("Lorry Driver", 30);

        Engine sport_car_engine = new Engine(800, "Ferrari motors");
        Driver sport_car_driver = new Driver("Sport Car Driver", 15);

        Car defaultCar = new Car("isn't defined", "isn't defined", 1, defaultEngine, defaultDriver);

        Lorry lorry = new Lorry("Tatra", "Heavy Vehicle", 8000, lorry_engine, lorry_driver, lorry_driver.getExperience());
        //                             SportCar(String marka, String carClass, int mass, Engine sportCar_engine, Driver truck_driver, int speed)
        SportCar sportCar = new SportCar("Ferrari", "SportCar", 900, sport_car_engine, sport_car_driver, 100500);

        /*System.out.println("распечатаем что должно быть в дефолтной тачке...");
        System.out.println(defaultCar);
        System.out.println("распечатаем что должно быть в грузовике...");
        System.out.println(lorry);
        System.out.println("распечатаем что должно быть в спорткаре...");
        System.out.println(sportCar);*/

        System.out.println(sportCar.getSpeed());





    }

}









//public Car(String carClass, int mass, Engine jz_2, Driver akademeg) {
//Engine turboEngine = new Engine(100, "Шевроле");
//Lorry lorry = new Lorry("Грузовичок", 100500, turboEngine, new Driver(), 8000);