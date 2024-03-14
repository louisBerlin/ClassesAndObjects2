package org.example;

import java.util.Arrays;

public class Library {


    Book[] arrayBook;

    public Library(Book[] arrayBook) {
        this.arrayBook = arrayBook;
    }


    @Override
    public String toString() {

        String s = " ";

        for (Book b : arrayBook){
            s = s + " \n " + b.toString();

        }


        return s;
    }
}
