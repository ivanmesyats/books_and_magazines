package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Створити клас User з полями: firstName, secondName, age. Виконати наступні операції:
Створити список з 10 обєктів типу User
відсортувати за віком та записати в нову колекцію
Підрахувати ссередній вік юзерів
Сортувати по декількам властивостям: firstName і age
Перевірити чи є юзери у юких прізвище починаєтся з літери "S' або "А"
Перевірити чи всі юзери старше 18 років*/

        Random random = new Random();

//        Book firstBook = new Book();
//        Book secondBook = new Book();
//        Magazine firstMagazine = new Magazine();
//        Magazine secondMagazine = new Magazine();
//
//        firstMagazine.magazineName = "BurdaModa";
//        firstBook.bookName = "Harry Potter";
//        secondMagazine.magazineName = "Life adn since";
//        secondBook.bookName = "Idiot";
//
//        //System.out.println(firstMagazine.magazineName);
//
//        Printable [] myArray = new Printable[4];
//        myArray[0] = firstMagazine;
//        myArray[1] = firstBook;
//        myArray[2] = secondMagazine;
//        myArray[3] = secondBook;
//
////        for (int i=0; i<2 ; i++){
////            myArray[i].print();
////        }
//
//        //Magazine.printMagazines(myArray);
//        Book.printBook(myArray);

        ArrayList<User> users = new ArrayList();

        int midAge = 0;
        int numberOfUsersStartsFromAorS = 0;
        int under18 = 0;

        for (int i = 0; i < 10; i++) {

            User user = new User();

            user.firstName = i+"firstName";
            user.secondName = "secondName";
            user.age = random.nextInt(9, 70);

            users.add(user);

        }
            //Collections.sort(users, ((o1, o2) -> o1.firstName.compareTo(o2.firstName)));
            Collections.sort(users, ((o1, o2) -> o1.age - o2.age));


            for (int i = 0; i < users.size(); i++) {

                User curUser = users.get(i);

                midAge = midAge + curUser.age;

                if (curUser.age < 18) {

                    under18++;
                }

                if (curUser.secondName.toUpperCase().startsWith("S") || curUser.secondName.toUpperCase().startsWith("A")) {

                    numberOfUsersStartsFromAorS++;
                }
            }
            users.forEach(System.out::println);
            System.out.println("Mid age of users is : " + midAge / users.size() + " Number of users younger then 18 are:" + under18 + " Number of users name starts from A or S :" + numberOfUsersStartsFromAorS);

            users.forEach(user -> user.print());

        }
    }

