package listCollection;

import model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Siti", "Maimunah", "Toyibah", "Rahmah"));
        System.out.println(names);

        names.set(2, "Aisyah");
        names.set(0, "Joko");
        System.out.println(names);

        List<Person> persons = new ArrayList<>(
                Arrays.asList(
                        new Person(1, "Joko", "Jakarta"),
                        new Person(2, "Andi", "Jakarta"),
                        new Person(3, "Budi", "Jakarta"),
                        new Person(4, "Manullang", "Medan"),
                        new Person(5, "Manurung", "Medan")
                )
        );
        for (int i = 0; i < persons.size(); i++) {
            System.out.println("Index ke " + i + " : " + persons.get(i));
        }

        System.out.println("\nSetalah Diubah");
        //indeks list => person class
        persons.set(0, new Person(1, "Gilang", "Lampung"));
//        persons.set(2, new Person(2, "Iko","Lampung"));
        for (int i = 0; i < persons.size(); i++) {
            System.out.println("Index ke " + i + " : " + persons.get(i));
        }

        List<Person> personList = persons.stream().filter(x -> x.getCity().equals("Medan")).collect(Collectors.toList());
        persons.removeAll(personList);
        System.out.println("\nSetalah Remove All");
        for(int i=0; i < persons.size(); i++) {
            System.out.println("Index ke "+i +" : "+persons.get(i));
        }

    }
}

