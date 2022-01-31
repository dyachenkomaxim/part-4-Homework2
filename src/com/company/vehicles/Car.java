package com.company.vehicles;

import com.company.detailes.Engine;
import com.company.professions.Driverr;

public  class Car {
    String carClass;
    Engine engine;
    Driverr driver;
    String marka;

    public Car(String carClass, Engine engine, Driverr driver, String marka) {
        this.carClass = carClass;
        this.engine = engine;
        this.driver = driver;
        this.marka = marka;
    }

    void start() {
        System.out.printf("Поехали");
    }

    void stop() {
        System.out.printf("Останавливаеся");
    }

    void turnRight() {
        System.out.printf("Поворот направо");
    }

    void turnLeft() {
        System.out.printf("Поворот налево");
    }
    void testgit(){

    }

    public String toString() {
        //System.out.printf(this.carClass + this.marka + this.driver + this.engine);
        return "Класс авто: " + this.carClass + " " + "Марка авто: "+ this.marka +" " + "Стаж водителя: " + this.driver.experience + " " + "Производитель двигателя: " + this.engine.company +  " Мощность двигателя: " + this.engine.power
        + " ФИО водителя: " + this.driver.fullname + " Возраст водителя: " + this.driver.age;
    }
}

