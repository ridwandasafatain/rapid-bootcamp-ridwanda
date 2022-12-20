package listCollection;

import model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainImmutable {
    public static void main(String[] args) {
        Person person = new Person("Ardian",
                Arrays.asList("Coding","Design","Testing"));

        System.out.println(person);
        // cara salah
        //person.getHobbies().add("Gamming");

        // cara benar
        List<String> hobbies = new ArrayList<>(person.getHobbies());
        hobbies.add("Gamming");
        person.setHobbies(hobbies);
        System.out.println(person);
    }
}
