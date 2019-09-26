package com.company.vehicles;

import com.company.details.Engine;
import com.company.homework7.Person;
import com.company.professions.Driver;

import java.util.Arrays;


public class Car  {
    String mark, carClass;
    int weight;
    Engine engines;
    Driver drivers;

    public Car(String mark, String carClass, int weight, Engine engines,  Driver drivers) {
        this.mark = mark;
        this.carClass = carClass;
        this.weight = weight;
        this.engines = engines;
        this.drivers = drivers;

    }


    void start() {

        System.out.println("Поехали!");
    }

    void stop() {
        System.out.println("Останавливаемся!");
    }

    void turnRight() {

        System.out.println("Поворот направо!");
    }

    void turnLeft() {

        System.out.println("Поворот налево!");
    }

    void printInfo(Car... car1) {
        System.out.println(Arrays.toString(car1));



    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", engine=" + engines +
                ", driver=" + drivers +
                '}';
    }
}


