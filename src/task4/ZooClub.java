package task4;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Builder
public class ZooClub {

    private Map<Person, List<Pet>> club;

    public void addMember(Person person) {
        if (!club.containsKey(person)) {
            club.put(person, person.getPets());
        }
    }

    public void removeMember(Person person) {
        club.remove(person);
    }

    public void addPetToMember(Person person, Pet pet) {
        if (club.containsKey(person)) {
            person.getPets().add(pet);
            club.put(person, person.getPets());
        }
    }

    public void removePetFromMember(Person person, Pet pet) {
        if (club.containsKey(person)) {
            person.getPets().remove(pet);
            club.put(person, person.getPets());
        }
    }

    public void removePetFromClub(Pet pet) {
        for (Map.Entry<Person, List<Pet>> entry : club.entrySet()) {
            Person person = entry.getKey();
            List<Pet> pets = entry.getValue();
            if (pets.remove(pet)) {
                club.put(person, pets);
            }
        }
    }

    public void displayClub() {
        for (Map.Entry<Person, List<Pet>> entry : club.entrySet()) {
            Person person = entry.getKey();
            List<Pet> pets = entry.getValue();
            System.out.println("Member: " + person.getName());
            for (Pet pet : pets) {
                System.out.println("  Pet: " + pet.getName() + ", Age: " + pet.getAge() + ", Type: " + pet.getType());
            }
        }
    }

}
