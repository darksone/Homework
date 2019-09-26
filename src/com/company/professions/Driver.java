package com.company.professions;

import com.company.homework7.Person;

public class Driver extends Person {
    double drivingExperience;

    public Driver(String fullName, int age, double drivingExperience) {
        super(fullName, age);
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "drivingExperience=" + drivingExperience +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}


