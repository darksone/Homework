package com.company.homework7;

public class Person {
    String fullName;
    int age;

    Person() {
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void move(int age) {
        System.out.println("Ему " + age + " лет.");
    }

    void talk(String s, String fullName) {
        System.out.println(fullName + " говорит: " + s);
    }
}
