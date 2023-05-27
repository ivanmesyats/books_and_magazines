package org.example;

public class Book implements Printable {

    String bookName;

    public void print() {
        System.out.println(bookName);
    }

    public static void printBook(Printable[] book) {

        for (Printable num : book) {

            if (num instanceof Book)
                num.print();
        }
    }
}
