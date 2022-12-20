package sortedSet;

import model.Person;

import java.util.*;
import java.util.stream.Collectors;

public class MainSortedSet {
    public static void main(String[] args) {
        SortedSet<Person> persons = new TreeSet<>(new PersonComparator());
        persons.add(new Person(1,"Joko","Jakarta"));
        persons.add(new Person(2,"Sugeng","Yogya"));
        persons.add(new Person(3,"Andi","Surabaya"));
        persons.add(new Person(4,"Randi","Surabaya"));
        persons.add(new Person(5,"Rudi","Surabaya"));
        persons.add(new Person(6,"Ridho","Bandung"));

        for (Person p: persons){
            System.out.println(p);
        }

        System.out.println("\nNavigableSet");

        NavigableSet<Person> personNav = new TreeSet<>(new PersonComparator());
        personNav.add(new Person(1,"Ani", "Surakarta"));
        personNav.add(new Person(2,"Bni", "Kartasura"));
        personNav.add(new Person(3,"Cili", "Karakata"));
        personNav.add(new Person(4,"Dli", "Jakarta"));

        for (Person p: personNav){
            System.out.println(p);
        }

        System.out.println("\nNavigableSet dibalik");
//        NavigableSet<Person> personNavRev = personNav.descendingSet();//defen ulang - ide
        //atau gini bisa
      List<Person> personNavRev = personNav.stream().sorted(Comparator.comparing(Person::getName).reversed())
                .collect(Collectors.toList());
        for (Person p: personNavRev){
            System.out.println(p);
        }
    }
}
