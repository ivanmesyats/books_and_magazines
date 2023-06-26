package org.example;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

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


        ArrayList<User> users = new ArrayList();

        AtomicInteger midAge = new AtomicInteger();
        AtomicInteger numberOfUsersStartsFromAorS = new AtomicInteger();
        AtomicInteger under18 = new AtomicInteger();

        for (int i = 0; i < 10; i++) {

            User user = new User();

            user.firstName = i+"firstName";
            user.secondName = "secondName";
            user.age = random.nextInt(9, 70);

            users.add(user);

        }
            //Collections.sort(users, ((o1, o2) -> o1.firstName.compareTo(o2.firstName)));
            Collections.sort(users, ((o1, o2) -> o1.age - o2.age));


            users.stream().forEach(user -> {
                midAge.set(midAge.get() + user.age);
                if (user.age < 18) {
                    under18.getAndIncrement();
                }
                if (user.secondName.toUpperCase().startsWith("S") || user.secondName.toUpperCase().startsWith("A")) {

                    numberOfUsersStartsFromAorS.getAndIncrement();
                }
            });

            users.forEach(System.out::println);
            System.out.println("Mid age of users is : " + midAge.get() / users.size() + " Number of users younger then 18 are: " + under18 + " Number of users name starts from A or S :" + numberOfUsersStartsFromAorS);

            users.forEach(user -> user.print());

        }
    }

