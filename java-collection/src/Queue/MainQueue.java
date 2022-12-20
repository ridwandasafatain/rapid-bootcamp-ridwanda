package Queue;
import model.Person;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class MainQueue {

    public static void main(String[] args) {
        Queue<Person> persons = new ArrayDeque<>(10);
        persons.offer(new Person(1, "Joko", "Jakarta", Arrays.asList("Sleep","Eat","Repeat")));
        persons.add(new Person(2, "Sugeng", "Yogya"));
        persons.add(new Person(3, "Andi", "Surabaya"));
        persons.add(new Person(4, "Randi", "Surabaya"));
        persons.add(new Person(5, "Rudi", "Surabaya"));
        persons.add(new Person(6, "Ridho", "Bandung"));
//        persons.offer("Joko");
//        persons.offer("Toko");

//        for (Person next = persons.poll(); next != null; next = persons.poll()) {
//            System.out.println(next);
//
//        }

        for (Person p: persons){
            System.out.println(p);
        }
        System.out.println("ini head "+persons.remove()); //unduk meremove head/ elemen pertama
        for (Person p: persons){
            System.out.println(p);
        }
    }
}
