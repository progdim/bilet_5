package com.company;

public class book {

   private String nameBook;
    private String nameAutor;

    public  book (String nameBook, String nameAutor){
        this.nameBook = nameAutor;
        this.nameAutor = nameBook;

    }

    @Override
    public String toString() {
        return nameAutor + " " + nameAutor;
    }
}
