package com.mpogorelov.professions;

public class Driver extends Person {
    private int experience;

    public Driver(String fullName, int age, int experience) {
        super(fullName, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Full name of the driver: " + getFullName()
                + "years of experience: " + experience
                + "age of the driver, years" + getAge();
    }
}