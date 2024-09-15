package task4;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Pet cat1 = Pet.builder().name("Whiskers").age(3).type(PetType.CAT).build();
        Pet cat2 = Pet.builder().name("Luna").age(2).type(PetType.CAT).build();
        Pet dog1 = Pet.builder().name("Rex").age(5).type(PetType.DOG).build();
        Pet dog2 = Pet.builder().name("Buddy").age(4).type(PetType.DOG).build();
        Pet bird1 = Pet.builder().name("Tweety").age(2).type(PetType.BIRD).build();
        Pet bird2 = Pet.builder().name("Polly").age(1).type(PetType.BIRD).build();
        Pet fish = Pet.builder().name("Nemo").age(1).type(PetType.FISH).build();

        Person alice = Person.builder().name("Alice").age(30).pets(new ArrayList<>()).build();
        Person bob = Person.builder().name("Bob").age(25).pets(new ArrayList<>()).build();
        Person charlie = Person.builder().name("Charlie").age(35).pets(new ArrayList<>()).build();
        Person dana = Person.builder().name("Dana").age(28).pets(new ArrayList<>()).build();
        Person eve = Person.builder().name("Eve").age(40).pets(new ArrayList<>()).build();

        ZooClub zooClub = ZooClub.builder().club(new HashMap<>()).build();

        zooClub.addMember(alice);
        zooClub.addMember(bob);
        zooClub.addMember(charlie);
        zooClub.addMember(dana);
        zooClub.addMember(eve);

        zooClub.addPetToMember(alice, cat1);
        zooClub.addPetToMember(alice, bird1);
        zooClub.addPetToMember(bob, dog1);
        zooClub.addPetToMember(charlie, cat2);
        zooClub.addPetToMember(charlie, dog2);
        zooClub.addPetToMember(dana, bird2);
        zooClub.addPetToMember(eve, fish);

        zooClub.displayClub();

        zooClub.removePetFromMember(alice, bird1);

        zooClub.removeMember(bob);

        System.out.println("----------------------------------- NEW STATE -------------------------------------------");
        zooClub.displayClub();

        zooClub.addPetToMember(dana, fish);
        zooClub.removePetFromClub(fish);

        System.out.println("------------------------------- CLUB WITHOUT FISH ---------------------------------------");
        zooClub.displayClub();
    }
}