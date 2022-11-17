package com.company;

public class Main {

   // book[] towBook = new book[10];

    public static void main(String[] args) {
        book[] towBook = new book[2];
        towBook[0] = new book("Гарри Поттер","Джоан Роулинг");
        towBook[1] = new book("Зеленая миля","Стивен Кинг");
        for (int i = 0; i < towBook.length; i++) {
            System.out.println(towBook[i]);
        }

//Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида: «Название книги» И. О. Автора.
//Как сравнить две строки в Java и/или отсортировать их?
//        if(  "Java" == "Java" ){
//            System.out.println("Statement  is true");
//        }else{
//            System.out.println("Statement is false");
//        }
       // Objects.equals().
//Когда применяется ключевое слово this?



  //      Что такое сигнатура метода?



    }

}





