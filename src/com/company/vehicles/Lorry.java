package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
 int carryingCapacity;

 public Lorry(String mark, String carClass, int weight, int carryingCapacity, Engine engine1, Driver drivers){
     super(mark,carClass,weight,engine1,drivers);
     this.carryingCapacity = carryingCapacity;
 }
}
