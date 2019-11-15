package com.company.shoptry2;

public enum Products {
    LORRY("Грузовик",900000,6.5), CAR("Автомобиль",450000.6,7.9),
    LAPTOP("Ноутбук",18000.564,9.3), PHONE("Телефон",9000.75,9.6),
    MACHINES("Машины"), ELECTRONICS("Электроника");

    private String name;
    private double price, rate;

    Products(String name, double price, double rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }
    Products(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
