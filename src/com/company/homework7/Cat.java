package com.company.homework7;

public class Cat extends Animal {
    private String colors;

    public Cat(String typeOfAnimal, String colors, String name, String food, String location) {
        super(typeOfAnimal, name, food, location);
        this.colors = colors;
    }

    public String getColors() {
        return colors;
    }


    void makeNoise() {
        System.out.println(getTypeOfAnimal() + ", " + getColors() + ", которую зовут " + getName() + ", шумит!");

    }

    void eat() {
        System.out.println(getTypeOfAnimal() + ", " + getColors() + ", которую зовут " + getName() + ", ест!");

    }

    void sleep() {
        System.out.println(getTypeOfAnimal() + ", " + getColors() + ", которую зовут  " + getName() + ", спит!");

    }

    void tripToTheVet() {
        System.out.println(getTypeOfAnimal() + ", " + getColors() + ", которую зовут  " + getName() + ", отправляется в поход к ветеринару!");

    }
}
