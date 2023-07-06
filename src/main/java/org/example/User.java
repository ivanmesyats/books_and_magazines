package org.example;
import java.util.stream.Stream;

public class User implements Printable {

    public String  firstName, secondName;
    public Integer age;


    @Override
    public String toString() {
        return firstName + " "+ secondName +" Age: " + age;
    }

    @Override
    public void print() {
        System.out.println(firstName +" " + secondName + age);
    }

    public int getAge (){
        return this.age;
    }

    public String getFirstName (){
        return this.firstName;
    }
    public String getSecondName (){
        return this.secondName;
    }

}
