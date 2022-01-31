package com.company.vehicles;
import com.company.detailes.Engine;
import com.company.professions.Driverr;

public class Lorry extends Car {
    int carrying;

    public Lorry(String carClass, Engine engine, Driverr driver, String marka, int carrying) {
        super(carClass, engine, driver, marka);
        this.carrying = carrying;
    }

}
