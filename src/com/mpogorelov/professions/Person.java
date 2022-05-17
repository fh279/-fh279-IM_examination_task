package com.mpogorelov.professions;

import com.mpogorelov.vehicles.Car;

public class Person extends Driver{
    private int age;


    public Person(String fullName, int experience, int age){
        super(fullName, experience);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Full name of the drivet: " + getFullName()
                + "years of experience: " + getExperience()
                + "age: " + age;
    }


}
