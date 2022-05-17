package com.mpogorelov.details;

public class Engine {
    private int power;
    private String company;

    public int getPower() {
        return power;
    }

    public String getCompany() {
        return company;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }
}