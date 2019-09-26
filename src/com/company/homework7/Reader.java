package com.company.homework7;

import java.util.Arrays;

public class Reader {
    String fullName, department, phoneNumber, dateOfBirth;
    int libraryCardNumber;
    static int count = Book.count;

    Reader(String fullName, String department, String phoneNumber, String dateOfBirth, int libraryCardNumber) {
        this.fullName = fullName;
        this.department = department;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.libraryCardNumber = libraryCardNumber;
    }

    void takeBook(String fullName, int quantity) {
        this.fullName = fullName;
        String s = "книги";
        if (quantity == 1) {
            s = "книгу";
        }
        System.out.println(fullName + " взял " + quantity + " " + s);


    }

    void takeBook(String fullName, String... nameOfBook) {
        this.fullName = fullName;
        System.out.println(fullName + " взял книги: ");
        for (String str : nameOfBook) {
            System.out.println(str + " ");

        }
    }

    void takeBook(String fullName, Book... book) {
        this.fullName = fullName;
        System.out.println(fullName + "взял книги: " + Arrays.toString(book));
    }

    void returnBook(String fullName, int quantity) {
        this.fullName = fullName;
        String s = "книги";
        if (quantity == 1) {
            s = "книгу";
        }
        System.out.println(fullName + " вернул " + quantity + " " + s);

    }

    void returnBook(String fullName, String... nameOfBook) {
        this.fullName = fullName;
        System.out.println(fullName + " вернул книги: ");
        for (String str : nameOfBook) {
            System.out.println(str + " ");

        }

    }

    void returnBook(String fullName, Book... book) {
        this.fullName = fullName;
        System.out.println(fullName + "вернул книги: " + Arrays.toString(book));
    }

}



