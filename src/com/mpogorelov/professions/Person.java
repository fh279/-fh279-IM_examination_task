package com.mpogorelov.professions;

import com.mpogorelov.vehicles.Car;

public class Person{
    private int age;
    private String fullName;


    public Person(String fullName, int age) {
this.age = age;
this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Full name of the driver: " + getFullName()
                + "age: " + age;
    }


}
