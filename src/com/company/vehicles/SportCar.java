package com.company.vehicles;
import com.company.detailes.Engine;
import com.company.professions.Driverr;

public class SportCar extends Car {
    double speed;

    public SportCar(String carClass, Engine engine, Driverr driver, String marka, double speed) {
        super(carClass, engine, driver, marka);
        this.speed = speed;
    }
}
