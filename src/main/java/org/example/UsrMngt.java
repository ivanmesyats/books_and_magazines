package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UsrMngt  extends  User{

    public static Boolean lessThen18 (ArrayList<User> users){
        return users.stream()
                .anyMatch(user -> user.getAge() < 18);
    }
    public static long midAge (ArrayList<User> users){
        return (users.stream()
                .mapToLong(age -> age.getAge())
                .sum())/ users.size();
    }

    public static Boolean sOrAinTheName (ArrayList<User> users){
        return users.stream()
                .anyMatch(user -> user.getSecondName().toUpperCase().startsWith("S") || user.getSecondName().toUpperCase().startsWith("A"));

    }

    public static List<User> sortBy (ArrayList<User> users){
        return users.stream()
                .sorted(Comparator.comparing(User::getAge))
//                .sorted(Comparator.comparing(User::getFirstName))
                .collect(Collectors.toList());
    }

    public static Boolean ageExists (ArrayList<User> users, int age){
        return users.stream()
                .anyMatch(user -> user.getAge() == age);
    }
}
