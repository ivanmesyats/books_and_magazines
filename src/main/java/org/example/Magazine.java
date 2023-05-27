package org.example;

public class Magazine implements Printable{

    String magazineName;
    public void print() {
        System.out.println(magazineName);
    }

    public static void printMagazines (Printable [] magazins ) {

        for (Printable num : magazins) {

            if (num instanceof Magazine)
            num.print();
        }

    }
}



