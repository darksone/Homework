package com.company.homework7;

public class Horse extends Animal {
    private String temperament;

    public Horse(String typeOfAnimal, String temperament, String name, String food, String location) {
        super(typeOfAnimal, name, food, location);
        this.temperament = temperament;
    }

    public String getTemperament() {
        return temperament;
    }


    void makeNoise() {
        System.out.println(getTypeOfAnimal() + ", " + getTemperament() + ", которую зовут " + getName() + ", шумит!");

    }

    void eat() {
        System.out.println(getTypeOfAnimal() + ", " + getTemperament() + ", которую зовут " + getName() + ", ест!");

    }

    void sleep() {
        System.out.println(getTypeOfAnimal() + ", " + getTemperament() + ", которую зовут " + getName() + ", спит!");

    }

    void tripToTheVet() {
        System.out.println(getTypeOfAnimal() + ", " + getTemperament() + ", которую зовут " + getName() + ", отправляется в поход к ветеринару!");


    }
}
