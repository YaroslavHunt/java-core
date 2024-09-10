import task4.Car;
import task4.GENDER;
import task4.Skill;
import task4.User;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(new Skill("java", 10));
        skills.add(new Skill("js", 10));
        skills.add(new Skill("c++", 10));

        Car toyota = new Car("toyota", 2021, 250);

        User user = new User(1, "vasya", "pupkin", "asd@asd.com", 31, GENDER.MALE, skills, toyota);

        System.out.println(user);
    }
}