

package com.company;

import com.company.detailes.Engine;
import com.company.professions.Driverr;
import com.company.vehicles.Lorry;

class Application {

    public static void main(String[] args) {
        Engine engine1 = new Engine(450, "Bayern1") {

            @Override
            public String toString() {
                return null;
            }
        };
        Driverr driver1 = new Driverr(44, "Максим Максимов", 22) {

            @Override
            public String toString() {
                return null;
            }
        };
        Lorry lorry1 = new Lorry("bmw", engine1, driver1, "777", 12);
        System.out.printf(lorry1.toString());


    }
}

