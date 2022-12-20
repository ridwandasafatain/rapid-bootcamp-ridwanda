package iterableCollection;

import model.Person;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainIterable {

    public static void main(String[] args) {
        Iterable<String> names = List.of("ab","cd","ef","gh");

//        bisa pilih pake for atau while(iterator)
        /*
        for(var name: names){
            System.out.println(name);
        }
        */

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }


        Iterable<Person> persons= Arrays.asList(
                new Person(1,"ab","Tokyo"),
                new Person(2,"cd","Kitoki"),
                new Person(3,"ef","Pilang"),
                new Person(4,"gh","Gerem")
        );

        /*
        for (var person: persons){
            System.out.print(person.getCity());
        }
        */
        Iterator<Person> personIterator =persons.iterator();
        while (personIterator.hasNext()){
            System.out.println(personIterator.next());
        }
    }
}
