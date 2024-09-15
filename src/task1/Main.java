package task1;

import User.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(User.builder().name("John").surname("Smith").age(28).build());
        users.add(User.builder().name("Emily").surname("Johnson").age(32).build());
        users.add(User.builder().name("Michael").surname("Brown").age(25).build());
        users.add(User.builder().name("Sophia").surname("Williams").age(29).build());
        users.add(User.builder().name("David").surname("Taylor").age(35).build());
        users.add(User.builder().name("Jessica").surname("Moore").age(27).build());
        users.add(User.builder().name("James").surname("Miller").age(30).build());
        users.add(User.builder().name("Emma").surname("Davis").age(24).build());
        users.add(User.builder().name("Daniel").surname("Garcia").age(33).build());
        users.add(User.builder().name("Olivia").surname("Martinez").age(26).build());

        System.out.println("-------------------------------------BY AGE----------------------------------------------");

        users.sort(Comparator.comparingInt(User::getAge));
        for (User user : users) {
            System.out.println(user.getName() + ": " + user.getAge());
        }

        System.out.println("--------------------------------BY AGE REVERSED------------------------------------------");

        users.sort(Comparator.comparingInt(User::getAge).reversed());
        for (User user : users) {
            System.out.println(user.getName() + ": " + user.getAge());
        }

        System.out.println("--------------------------------BY NAME LENGTH-------------------------------------------");

        users.sort(Comparator.comparingInt(user -> user.getName().length()));
        for (User user : users) {
            System.out.println(user.getName());
        }

        System.out.println("-----------------------------BY NAME LENGTH REVERSED-------------------------------------");

        users.sort(Comparator.comparingInt((User user) -> user.getName().length()).reversed());
        for (User user : users) {
            System.out.println(user.getName());
        }



    }
}