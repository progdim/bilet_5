package com.company;

public class Main {

   // book[] towBook = new book[10];

    public static void main(String[] args) {
        book[] towBook = new book[2];
        towBook[0] = new book("Гарри Поттер","Джоан Роулинг");
        towBook[1] = new book("Зеленая миля","Стивен Кинг");
        for (book book : towBook) {
            System.out.println(book.toString());
        }

    }
}

