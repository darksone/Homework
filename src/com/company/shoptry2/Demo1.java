package com.company.shoptry2;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(Products.LAPTOP.getName(), Products.LAPTOP.getRate(), Products.LAPTOP.getPrice()));
        productList.add(new Product(Products.PHONE.getName(), Products.PHONE.getRate(), Products.PHONE.getPrice()));
        productList.add(new Product(Products.CAR.getName(), Products.CAR.getRate(), Products.CAR.getPrice()));
        productList.add(new Product(Products.LORRY.getName(), Products.LORRY.getRate(), Products.LORRY.getPrice()));

        Map<Integer, Product> productMap = new HashMap<>();
        productMap.put(0, new Product(Products.LAPTOP.getName(), Products.LAPTOP.getRate(), Products.LAPTOP.getPrice()));
        productMap.put(1, new Product(Products.PHONE.getName(), Products.PHONE.getRate(), Products.PHONE.getPrice()));
        productMap.put(2, new Product(Products.CAR.getName(), Products.CAR.getRate(), Products.CAR.getPrice()));
        productMap.put(3, new Product(Products.LORRY.getName(), Products.LORRY.getRate(), Products.LORRY.getPrice()));
        Set<Integer> keys1 = productMap.keySet();

        Map<Integer, Category> categoryMap = new HashMap<>();
        categoryMap.put(0, new Category(Products.ELECTRONICS.getName(), productMap.get(0), productMap.get(1)));
        categoryMap.put(1, new Category(Products.MACHINES.getName(), productMap.get(2), productMap.get(3)));
        Set<Integer> keys = categoryMap.keySet();

        List<Basket> basket = new ArrayList<>();

        Map<Integer, User> usersMap = new HashMap<>();
        usersMap.put(0, new User("login", "password"));
        usersMap.put(1, new User("password", "login"));
        usersMap.put(2, new User("password", "login"));
        Set<Integer> keys2 = usersMap.keySet();

        System.out.println("Авторизация\nВведите логин и пароль для входа в личный кабинет");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        String password = scanner.nextLine();

        for (int key : keys2) {
            if (login.equals(usersMap.get(key).getLogin()) && password.equals(usersMap.get(key).getPassword())) {
                System.out.println("Вход выполнен успешно!\nПерейти к списку каталогов товаров?\nДа Нет");
                String answer = scanner.nextLine();
                if (answer.equals("Да")) {
                    for (int key1 : keys) {
                        if (categoryMap.get(key1) == null) {
                            break;
                        } else {
                            System.out.println(categoryMap.get(key1).getName());
                        }
                    }
                    System.out.println("\nЧтобы просмотреть товары определенного каталога, введите имя нужного вам каталога!");
                    String category = scanner.nextLine();
                    for (int key2 : keys) {
                        if (categoryMap.get(key2) == null) {
                            break;
                        } else if (category.equals(categoryMap.get(key2).getName())) {
                            System.out.println(Arrays.toString(categoryMap.get(key2).getProducts()));
                        }
                    }
                    System.out.println("Добавить продукт в корзину?\nДа? или Нет?");
                    Scanner scanner2 = new Scanner(System.in);
                    String answer4 = scanner2.nextLine();
                    while (answer4.equals("Да")) {
                        for (int n = 0; n < 10; n++) {
                            System.out.println("\nЧтобы добавить товар в корзину, напишите его название");
                            String product = scanner2.nextLine();
                            for (int key3 : keys1) {
                                if (productMap.get(key) == null) {
                                    break;
                                } else if (product.equals(productMap.get(key3).getName())) {
                                    basket.add(new Basket(productMap.get(key3), today));
                                    System.out.println("Поздравляем, вы добавили " + productMap.get(key3).getName() + " в свою корзину. Рейтинг товара: " + productMap.get(key3).getRate() +
                                            " .Стоимость покупки составляет " + productMap.get(key3).getPrice() + ". ");
                                }
                            }
                            System.out.println("Вы хотите купить еще один товар?\nДа или Нет?");
                            answer4 = scanner2.nextLine();
                            if (answer4.equals("Нет")) {
                                break;
                            }
                        }
                    }
                    System.out.println("Вы потверждаете покупку?\nДа Нет");
                    String answer2 = scanner2.nextLine();
                    if (answer2.equals("Да")) {
                        System.out.println("Поздравляю, вы купили данный товар!");
                    } else if (answer2.equals("Нет")) {
                        System.out.println("Вы отменили покупку товара.");
                    } else {
                        System.out.println("Завершение программы.");
                    }
                } else if (answer.equals("Нет")) {
                    System.out.println("Перейти к списку всех товаров?\nДа? Нет?");
                    Scanner scanner3 = new Scanner(System.in);
                    String answer3 = scanner3.nextLine();
                    if (answer3.equals("Да")) {
                        System.out.println("Отсортировать по цене, рейтингу или по названию?\nЦена? Рейтинг? Имя?");
                        String answer4 = scanner3.nextLine();
                        switch (answer4) {
                            case "Цена":
                                System.out.println("Отсортировать по возрастанию(1) или по убыванию(2)?\n1? 2?");
                                int order = scanner3.nextInt();
                                if (order == 1) {
                                    productList.sort(new ProductPriceComparator());
                                    productList.forEach(System.out::println);
                                } else if (order == 2) {
                                    productList.sort(new ProductPriceComparator());
                                    Collections.reverse(productList);
                                    productList.forEach(System.out::println);
                                } else {
                                    break;
                                }
                                break;
                            case "Рейтинг":
                                System.out.println("Отсортировать по возрастанию(1) или по убыванию(2)?\n1? 2?");
                                int order1 = scanner3.nextInt();
                                if (order1 == 1) {
                                    productList.sort(new ProductRateComparator());
                                    productList.forEach(System.out::println);
                                } else if (order1 == 2) {
                                    productList.sort(new ProductRateComparator());
                                    Collections.reverse(productList);
                                    productList.forEach(System.out::println);
                                } else {
                                    break;
                                }
                                break;
                            case "Имя":
                                System.out.println("Отсортировать по алфавитному порядку(1) или наоборот(2)?\n1? 2?");
                                int order2 = scanner3.nextInt();
                                if (order2 == 1) {
                                    productList.sort(new ProductNameComparator());
                                    productList.forEach(System.out::println);
                                } else if (order2 == 2) {
                                    productList.sort(new ProductNameComparator());
                                    Collections.reverse(productList);
                                    productList.forEach(System.out::println);
                                } else {
                                    break;
                                }
                                break;
                        }
                    }
                }
                System.out.println();
                System.out.println("Вы хотите получить отчёт по интернет-магазину?");
                System.out.println("Да или Нет?");
                Scanner scanner4 = new Scanner(System.in);
                String answer5 = scanner4.nextLine();
                if (answer5.equals("Да")) {
                    getReport();
                }
                break;
            }
        }
        System.out.println("Завершение работы");
    }




    private static void getReport() {
        Locale ru = new Locale("ru", "RU");
        Locale.setDefault(ru);
        LocalDate today = LocalDate.now();
        ResourceBundle rb = ResourceBundle.getBundle("text", ru);
        int year = today.getYear();
        int month = today.getMonthValue();
        int dayMonth = today.getDayOfMonth();
        char currency = '\u20B4';

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

        System.out.println("Дата:                          " + dayMonth + "." + month + "." + year);
        System.out.println("Продукты      Категория      Цена");
        System.out.println("----------------------------------");
        System.out.println(Products.LAPTOP.getName() + "      " + Products.ELECTRONICS.getName() + "    " + nfPrice.format(Products.LAPTOP.getPrice()) + currency);
        System.out.println(Products.PHONE.getName() + "      " + Products.ELECTRONICS.getName() + "     " + nfPrice.format(Products.PHONE.getPrice()) + currency);
        System.out.println(Products.LORRY.getName() + "       " + Products.MACHINES.getName() + "      " + nfPrice.format(Products.LORRY.getPrice()) + currency);
        System.out.println(Products.CAR.getName() + "     " + Products.MACHINES.getName() + "      " + nfPrice.format(Products.CAR.getPrice()) + currency);
        System.out.println("----------------------------------");
        System.out.println("Итого:                   " + nfPrice.format(sumPrice()) + currency);
    }

    private static double sumPrice() {
        return Products.LAPTOP.getPrice() + Products.PHONE.getPrice() + Products.LORRY.getPrice() + Products.CAR.getPrice();
    }
}













