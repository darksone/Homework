package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    int topSpeed;

    public SportCar(String mark, String carClass, int weight, int topSpeed, Engine engine1, Driver drivers){
       super(mark, carClass, weight, engine1, drivers);
       this.topSpeed = topSpeed;

    }
}
