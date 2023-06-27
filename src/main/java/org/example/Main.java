package org.example;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        for (int i = 0; i < 10; i++) {

            User user = new User();

            user.firstName = i+"firstName";
            user.secondName = "secondName";
            user.age = random.nextInt(9, 70);

            users.add(user);

        }



        List<User> sortBy = users.stream()
                .sorted(Comparator.comparing(User::getAge))
//                .sorted(Comparator.comparing(User::getFirstName))
                .collect(Collectors.toList());

        sortBy.forEach(System.out::println);

        boolean lessThen18 = users.stream()
                .anyMatch(user -> user.getAge() < 18);


        boolean sOrAinTheName = users.stream()
                .anyMatch(user -> user.getSecondName().toUpperCase().startsWith("S") || user.getSecondName().toUpperCase().startsWith("A") );


        Integer midAge = users.stream().mapToInt(age -> age.getAge())
                    .sum();

        System.out.println("Mid age of users is : " + midAge / users.size() + " Users younger then 18 are: " + lessThen18 + " Users name starts from A or S :" + sOrAinTheName);


        }
    }

