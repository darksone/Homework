package com.company.shoptry2;

import java.util.Objects;
import java.util.Scanner;

public class User {
    private String login, password;

    public Basket getBaskets() {
        return baskets;
    }

    public void setBaskets(Basket baskets) {
        this.baskets = baskets;
    }

    private Basket baskets;

    public User(String login, String password, Basket baskets) {
        this.login = login;
        this.password = password;
        this.baskets = baskets;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(password, user.password) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
