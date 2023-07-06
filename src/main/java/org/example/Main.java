package org.example;


import java.util.*;
import java.util.stream.Collectors;

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






//        System.out.println(sortBy(users));

        System.out.println(UsrMngt.sortBy(users));

        System.out.println(UsrMngt.lessThen18(users));

        System.out.println(UsrMngt.midAge(users));

        System.out.println(UsrMngt.sOrAinTheName(users));

//        System.out.println("Mid age of users is : " + midAge / users.size() + " Users younger then 18 are: " + lessThen18 + " Users name starts from A or S :" + sOrAinTheName);


        }
//        public static Boolean lessThen18 (ArrayList<User> users){
//                return users.stream()
//                .anyMatch(user -> user.getAge() < 18);
//    }
//
//        public static long midAge (ArrayList<User> users){
//             return (users.stream()
//                     .mapToLong(age -> age.getAge())
//                    .sum())/ users.size();
//        }
//
//    public static Boolean sOrAinTheName (ArrayList<User> users){
//        return users.stream()
//                .anyMatch(user -> user.getSecondName().toUpperCase().startsWith("S") || user.getSecondName().toUpperCase().startsWith("A"));
//
//    }
//
//    public static List<User> sortBy (ArrayList<User> users){
//        return users.stream()
//                .sorted(Comparator.comparing(User::getAge))
////                .sorted(Comparator.comparing(User::getFirstName))
//                .collect(Collectors.toList());
//    }


}

