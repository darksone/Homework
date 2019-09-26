package com.company.homework7;

public class Book {
    String writer, nameOfBook;
    static int count = 0;

    Book(String writer,  String nameOfBook){
        this.writer = writer;
        this.nameOfBook = nameOfBook;
        count++;


    }

    @Override
    public String toString() {
        return  nameOfBook ;
    }
}
