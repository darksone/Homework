package com.company.homework7;

public class ReaderDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Джордж Р.Р. Мартин", "Игра престолов");
        Book book2 = new Book("Стивен Кинг","Оно");
        Book book3 = new Book("Федор Достоевский","Преступление и наказание");
        Reader reader1 = new Reader("Молозовенко Е.А.","КШБ","+380994399314","27.07.2000", 1);
        Reader reader2 = new Reader("Скорик М.С.","КШБ","+380668923948","25.05.2000",2);

        reader1.takeBook(reader1.fullName,Book.count);
        reader2.takeBook(reader2.fullName,1);

        reader1.takeBook(reader1.fullName,book1.nameOfBook,book2.nameOfBook,book3.nameOfBook);
        reader2.takeBook(reader2.fullName,book1.nameOfBook);

        reader1.takeBook(reader1.fullName,book1,book2,book3);
        reader2.takeBook(reader2.fullName,book1);

        reader1.returnBook(reader1.fullName,Book.count);
        reader2.returnBook(reader2.fullName,1);

        reader1.returnBook(reader1.fullName,book1.nameOfBook,book2.nameOfBook,book3.nameOfBook);
        reader2.returnBook(reader2.fullName,book1.nameOfBook);

        reader1.returnBook(reader1.fullName,book1,book2,book3);
        reader2.returnBook(reader2.fullName,book1);




    }
}
