package com.company.homework7;

public abstract class Animal {
    private String typeOfAnimal, name, food, location;

    public Animal(String typeOfAnimal, String name, String food, String location) {
        this.typeOfAnimal = typeOfAnimal;
        this.name = name;
        this.food = food;
        this.location = location;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }


    public String getName() {
        return name;
    }


    public String getFood() {
        return food;
    }


    public String getLocation() {
        return location;
    }



    void makeNoise() {
        System.out.println("Это животное шумит!");

    }

    void sleep() {
        System.out.println("Это животное спит!");

    }

    void eat() {
        System.out.println("Это животное ест!");

    }

    void tripToTheVet() {

    }
}
