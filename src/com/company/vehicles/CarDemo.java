package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class CarDemo {
    public static void main(String[] args) {
        Driver[] drivers = new Driver[3];
        Engine[] engines = new Engine[3];
        drivers[0] = new Driver("Молозовенко Е.А.", 19, 1);
        drivers[1] = new Driver("Скорик М.С.", 19, 2);
        drivers[2] = new Driver("Григалюнас Д.В.", 19, 0.5);
        engines[0] = new Engine(1020, "Bugatti Automobiles");
        engines[1] = new Engine(610, "Mercedes-Benz");
        engines[2] = new Engine(500, "Ford Ecotorq");

        Car car1 = new Car("Mercedes-Benz W213", "business", 1690, engines[1], drivers[1]);
        Car car2 = new Lorry("Ford Trucks", "truck", 18000, 10276, engines[2], drivers[2]);
        Car car3 = new SportCar("Bugatti Veyron Super Sport", "SuperCar", 1888, 407, engines[0], drivers[0]);


        car1.printInfo(car1);
        car2.printInfo(car2);
        car3.printInfo(car3);
    }
}
