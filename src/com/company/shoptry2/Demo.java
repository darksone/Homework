package com.company.shoptry2;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.ResourceBundle;


public class Demo {

    public static void main(String[] args) {


        Product[] products = new Product[1000];
        products[0] = new Product("Ноутбук", 9.3, 18000.4578);
        products[1] = new Product("Телефон", 9.6, 9000.454);
        products[2] = new Product("Автомобиль", 7.9, 450000.6);
        products[3] = new Product("Грузовик", 6.5, 900000);

        Category[] categories = new Category[100];
        categories[0] = new Category("Электроника", products[0], products[1]);
        categories[1] = new Category("Машины", products[2], products[3]);


        Basket[] basket = new Basket[10000];
        basket[0] = new Basket();
        basket[1] = new Basket();

        User[] users = new User[10000];
        users[0] = new User("login", "password", basket[0]);
        users[1] = new User("password", "login", basket[1]);
        users[2] = new User("password", "login", basket[1]);


        NumberFormat nfPrice = NumberFormat.getInstance();
        nfPrice.setMaximumFractionDigits(2);
        nfPrice.setMaximumIntegerDigits(9);
        nfPrice.setMinimumFractionDigits(0);
        nfPrice.setMinimumIntegerDigits(1);
        NumberFormat nfRate = NumberFormat.getInstance();
        nfRate.setMaximumFractionDigits(1);
        nfRate.setMaximumIntegerDigits(1);
        nfRate.setMinimumFractionDigits(1);
        nfRate.setMinimumIntegerDigits(1);


        Scanner scr1 = new Scanner("Авторизация\nВведите логин и пароль для входа в личный кабинет");
        String firstS = scr1.nextLine();
        System.out.println(firstS);
        String secondS = scr1.nextLine();
        System.out.println(secondS);

        Scanner scr2 = new Scanner(System.in);
        String login = scr2.nextLine();
        String password = scr2.nextLine();

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                break;
            } else if (login.equals(users[i].getLogin()) && password.equals(users[i].getPassword())) {
                System.out.println("Вход выполнен успешно!");
                Scanner scr3 = new Scanner("Перейти к списку каталогов товаров?\nДа Нет");
                String thirdS = scr3.nextLine();
                System.out.println(thirdS);
                String fourthS = scr3.nextLine();
                System.out.println(fourthS);

                Scanner scr4 = new Scanner(System.in);
                String answer = scr4.nextLine();

                if (answer.equals("Да")) {
                    for (int m = 0; m < categories.length; m++) {
                        if (categories[m] == null) {
                            break;
                        } else {
                            System.out.println(categories[m].getName());
                        }
                    }
                    Scanner scr5 = new Scanner("\nЧтобы просмотреть товары определенного каталога, введите имя нужного вам каталога!");
                    String fifthS = scr5.nextLine();
                    System.out.println(fifthS);
                    String sixthS = scr5.nextLine();
                    System.out.println(sixthS);
                    Scanner scr6 = new Scanner(System.in);
                    String category = scr6.nextLine();
                    for (int q = 0; q < categories.length; q++) {
                        if (categories[q] == null) {
                            break;
                        } else if (category.equals(categories[q].getName())) {
                            System.out.println(Arrays.toString(categories[q].getProducts()));
                        }
                    }
                    Scanner scr7 = new Scanner("\nСколько товаров будете покупать?");
                    String ninthS = scr7.nextLine();
                    System.out.println(ninthS);
                    String tenthS = scr7.nextLine();
                    System.out.println(tenthS);
                    Scanner scr8 = new Scanner(System.in);
                    int quantity = scr8.nextInt();
                    Scanner scr9 = new Scanner("\nЧтобы добавить товар в корзину, напишите его название");
                    String seventhS = scr9.nextLine();
                    System.out.println(seventhS);
                    String eighthS = scr9.nextLine();
                    System.out.println(eighthS);
                    Scanner scr10 = new Scanner(System.in);
                    String product = scr10.nextLine();
                    for (Product value : products) {
                        if (value == null) {
                            break;
                        } else if (product.equals(value.getName())) {
                            int p = 0;
                            basket[p] = new Basket(value);
                            System.out.println("Поздравляем, вы добавили " + value.getName() + " в свою корзину. Рейтинг товара: " + nfRate.format(value.getRate()) +
                                    " .Стоимость покупки составляет " + nfPrice.format(value.getPrice()) + ". Вы действительно хотите купить данный товар?");

                        }
                    }
                    Scanner scr11 = new Scanner("\nДа Нет");
                    String eleventhS = scr11.nextLine();
                    System.out.println(eleventhS);
                    String twelfthS = scr11.nextLine();
                    System.out.println(twelfthS);
                    Scanner scr12 = new Scanner(System.in);
                    String answer2 = scr12.nextLine();
                    if (answer2.equals("Да")) {
                        System.out.println("Поздравляю, вы купили данный товар!");
                    } else if (answer2.equals("Нет")) {
                        System.out.println("Вы отменили покупку товара.");
                    } else {
                        System.out.println("Завершение программы.");
                    }


                }
                break;


            } else {
                System.out.println("Завершение работы");
                break;
            }


        }


    }


}












