package com.company.shoptry2;

import java.util.Scanner;


public class Demo {

    public static void main(String[] args) {
        Product[] products = getProducts();
        Category[] categories = new Category[100];
        getCategories(products, categories);
        Basket[] basket = new Basket[10000];
        getBaskets(products, basket);
        User[] users = new User[10000];
        users[0] = new User("login", "password", basket[0]);
        users[1] = new User("password", "login", basket[1]);
        users[2] = new User("password","login", basket[1]);


        Scanner scr1 = new Scanner("Авторизация\nВведите логин и пароль для входа в личный кабинет");
        String firstS = scr1.nextLine();
        System.out.println(firstS);
        String secondS = scr1.nextLine();
        System.out.println(secondS);

        Scanner scr2 = new Scanner(System.in);
        String login = scr2.nextLine();
        String password = scr2.nextLine();



        int i;
        for ( i = 0; i < users.length; i++) {
            if(login.equals(users[i].getLogin()) && password.equals(users[i].getPassword())){
                System.out.println("Вход успешно выполнен");
            }
            else{
            }
            System.out.println("Вход не выполнен");
        }


    }

    public static void getBaskets(Product[] products, Basket[] basket) {
        basket[0] = new Basket(products[0], products[2]);
        basket[1] = new Basket(products[1], products[3]);
    }

    public static void getCategories(Product[] products, Category[] categories) {
        categories[0] = new Category("Электроника", products[0], products[1]);
        categories[1] = new Category("Машины", products[2], products[3]);
    }


    public static Product[] getProducts() {
        Product[] products = new Product[1000];
        products[0] = new Product("Ноутбук", 9.3, 18000);
        products[1] = new Product("Телефон", 9.6, 9000);
        products[2] = new Product("Автомобиль", 7.9, 450000);
        products[3] = new Product("Грузовик", 6.5, 900000);
        return products;
    }


}

