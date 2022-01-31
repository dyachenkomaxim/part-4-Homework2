package com.company.detailes;

public abstract class Engine{
   public int power;
   public String company;

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    public abstract String toString();
}