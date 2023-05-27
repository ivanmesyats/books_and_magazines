package org.example;


public class Main {
    public static void main(String[] args) {
        /*Створити наступну реалізацію:
Визначити інтерфейс Printable, який містить метод void print().
Визначити клас Book, який реалізує інтерфейс Printable.
Визначити клас Magazine, який реалізує інтерфейс Printable.
Створити масив типу Printable, який міститиме книги та журнали.
У циклі пройти масивом і викликати метод print() кожного об'єкта.
Створити статичний метод printMagazines(Printable[] printable) у класі Magazine, який виводить на консоль назви лише журналів.
Створити статичний метод printBooks(Printable[] printable) у класі Book, який виводить на консоль назви лише книг. Використовуємо оператор instanceof.*/

        Book firstBook = new Book();
        Book secondBook = new Book();
        Magazine firstMagazine = new Magazine();
        Magazine secondMagazine = new Magazine();

        firstMagazine.magazineName = "BurdaModa";
        firstBook.bookName = "Harry Potter";
        secondMagazine.magazineName = "Life adn since";
        secondBook.bookName = "Idiot";

        //System.out.println(firstMagazine.magazineName);

        Printable [] myArray = new Printable[4];
        myArray[0] = firstMagazine;
        myArray[1] = firstBook;
        myArray[2] = secondMagazine;
        myArray[3] = secondBook;

//        for (int i=0; i<2 ; i++){
//            myArray[i].print();
//        }

        //Magazine.printMagazines(myArray);
        Book.printBook(myArray);
    }
}