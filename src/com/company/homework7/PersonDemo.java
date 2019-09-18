package com.company.homework7;


public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Женя", 19);
        person2.talk("Мне нравится программировать!:)", person2.fullName);
        person2.move(person2.age);


    }
}
