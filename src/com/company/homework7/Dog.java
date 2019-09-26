package com.company.homework7;

public class Dog extends Animal {
    private String typeOfBreed;

    public Dog(String typeOfAnimal, String typeOfBreed, String name, String food, String location) {
        super(typeOfAnimal, name, food, location);
        this.typeOfBreed = typeOfBreed;
    }

    public String getTypeOfBreed() {
        return typeOfBreed;
    }


    void makeNoise() {
        System.out.println(getTypeOfAnimal() + ", " + getTypeOfBreed() + ", которую зовут " + getName() + ", шумит!");

    }

    void eat() {
        System.out.println(getTypeOfAnimal() + ", " + getTypeOfBreed() + ", которою зовут " + getName() + ", ест!");

    }

    void sleep() {
        System.out.println(getTypeOfAnimal() + ", " + getTypeOfBreed() + ", которую зовут " + getName() + ", спит!");

    }

    void tripToTheVet() {
        System.out.println(getTypeOfAnimal() + ", " + getTypeOfBreed() + ", которую зовут " + getName() + ", отправляется в поход к ветеринару!");

    }

}
