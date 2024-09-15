package task3;

import User.Car;
import User.Gender;
import User.Skill;
import User.User;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user1 = User.builder()
                .id(1)
                .name("John")
                .surname("Smith")
                .email("john.smith@example.com")
                .age(28)
                .gender(Gender.MALE)
                .skills(Arrays.asList(Skill.builder().title("Java").exp(5).build(), Skill.builder().title("Spring").exp(4).build()))
                .car(Car.builder().model("BMW X5").year(2020).power(300).build())
                .build();

        User user2 = User.builder()
                .id(2)
                .name("Emily")
                .surname("Johnson")
                .email("emily.johnson@example.com")
                .age(32)
                .gender(Gender.FEMALE)
                .skills(Arrays.asList(Skill.builder().title("Python").exp(5).build(), Skill.builder().title("Django").exp(4).build()))
                .car(Car.builder().model("Audi A6").year(2019).power(250).build())
                .build();

        User user3 = User.builder()
                .id(3)
                .name("Michael")
                .surname("Brown")
                .email("michael.brown@example.com")
                .age(25)
                .gender(Gender.MALE)
                .skills(Arrays.asList(Skill.builder().title("JavaScript").exp(4).build(), Skill.builder().title("React").exp(5).build()))
                .car(Car.builder().model("Tesla Model 3").year(2021).power(350).build())
                .build();

        User user4 = User.builder()
                .id(4)
                .name("Sophia")
                .surname("Williams")
                .email("sophia.williams@example.com")
                .age(29)
                .gender(Gender.FEMALE)
                .skills(Arrays.asList(Skill.builder().title("HTML").exp(5).build(), Skill.builder().title("CSS").exp(4).build()))
                .car(Car.builder().model("Toyota Camry").year(2018).power(200).build())
                .build();

        User user5 = User.builder()
                .id(5)
                .name("David")
                .surname("Taylor")
                .email("david.taylor@example.com")
                .age(35)
                .gender(Gender.MALE)
                .skills(Arrays.asList(Skill.builder().title("C++").exp(5).build(), Skill.builder().title("Qt").exp(3).build()))
                .car(Car.builder().model("Mercedes E-Class").year(2022).power(400).build())
                .build();

        User user6 = User.builder()
                .id(6)
                .name("Jessica")
                .surname("Moore")
                .email("jessica.moore@example.com")
                .age(27)
                .gender(Gender.FEMALE)
                .skills(Arrays.asList(Skill.builder().title("Ruby").exp(4).build(), Skill.builder().title("Rails").exp(5).build()))
                .car(Car.builder().model("Honda Civic").year(2017).power(180).build())
                .build();

        User user7 = User.builder()
                .id(7)
                .name("James")
                .surname("Miller")
                .email("james.miller@example.com")
                .age(30)
                .gender(Gender.MALE)
                .skills(Arrays.asList(Skill.builder().title("PHP").exp(3).build(), Skill.builder().title("Laravel").exp(4).build()))
                .car(Car.builder().model("Ford Focus").year(2015).power(160).build())
                .build();

        User user8 = User.builder()
                .id(8)
                .name("Emma")
                .surname("Davis")
                .email("emma.davis@example.com")
                .age(24)
                .gender(Gender.FEMALE)
                .skills(Arrays.asList(Skill.builder().title("Go").exp(4).build(), Skill.builder().title("Docker").exp(5).build()))
                .car(Car.builder().model("Mazda CX-5").year(2020).power(220).build())
                .build();

        User user9 = User.builder()
                .id(9)
                .name("Daniel")
                .surname("Garcia")
                .email("daniel.garcia@example.com")
                .age(33)
                .gender(Gender.MALE)
                .skills(Arrays.asList(Skill.builder().title("Kotlin").exp(5).build(), Skill.builder().title("Android").exp(4).build()))
                .car(Car.builder().model("Hyundai Tucson").year(2019).power(240).build())
                .build();

        User user10 = User.builder()
                .id(10)
                .name("Olivia")
                .surname("Martinez")
                .email("olivia.martinez@example.com")
                .age(26)
                .gender(Gender.FEMALE)
                .skills(Arrays.asList(Skill.builder().title("Swift").exp(4).build(), Skill.builder().title("iOS").exp(5).build()))
                .car(Car.builder().model("Chevrolet Malibu").year(2021).power(250).build())
                .build();

        Set<User> users1 = new HashSet<>();
        users1.add(user1);
        users1.add(user2);
        users1.add(user3);
        users1.add(user4);
        users1.add(user5);
        users1.add(user6);
        users1.add(user7);
        users1.add(user8);
        users1.add(user9);
        users1.add(user10);

//        Iterator<User> iterator = users1.iterator();
//        while (iterator.hasNext()) {
//            User user = iterator.next();
//            if (user.getGender().equals(Gender.MALE)) {
//                iterator.remove();
//            }
//        }
        users1.removeIf(user -> user.getGender().equals(Gender.MALE)); // Підказало середовище

        System.out.println(users1.size());

        Set<User> users2 = new TreeSet<>(Comparator
                .comparingInt((User user) -> user.getSkills().size())
                .thenComparing(User::getName));
        users2.add(user1);
        users2.add(user2);
        users2.add(user3);
        users2.add(user4);
        users2.add(user5);
        users2.add(user6);
        users2.add(user7);
        users2.add(user8);
        users2.add(user9);
        users2.add(user10);


        for (User user : users2) {
            System.out.println(user.getName() + ": " + user.getSkills().size());
        }
    }
}