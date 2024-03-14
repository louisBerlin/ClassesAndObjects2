package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Book b1 = new Book("titre1", "author1","435345345345");
        Book b2 = new Book("titre2", "author2","435546546");




        Book[] ba = {b1,b2};


        Library l = new Library(ba);

        System.out.println(l.toString());



    }
}