package com.company.homework7;

public class Vet {
    private static void treatAnimal(Animal animal) {

        System.out.println(animal.getTypeOfAnimal() + " " + animal.getName() + " ест " + animal.getFood() + " в " + animal.getLocation() + "e");
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        Dog dog = new Dog("Собака", "немецкая овчарка", "Эльза", "мясо", "загон");
        Cat cat = new Cat("Кошка", "черная", "Ема", "корм", "дом");
        Horse horse = new Horse("Лошадь", "сильный уравновешенный подвижный", "Кира", "сено", "загон");
        animals[0] = dog;
        animals[1] = cat;
        animals[2] = horse;
        for (Animal animal : animals) {
            animal.tripToTheVet();

        }

    }


}
