package com.mpogorelov.professions;

public class Driver {
    private String fullName; // по схеме это поля в классе Driver нет, но есть по описанию.
    // В итоге сделаю так, что поле fullName есть и оно будет наследоваться дочерним классом Person.
    private int experience;

    public String getFullName() {
        return fullName;
    }

    public int getExperience() {
        return experience;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Driver(String fullName, int experience) {
        this.fullName = fullName;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Full name of the driver: " + fullName
                + "years of experience: " + experience;
    }
}
