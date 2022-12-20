package iterableCollection;

import model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class MainCollection {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();

        names.add("Oiri");
        names.add("Saori");
        names.add("Nairi");
        names.addAll(List.of("Oki","Seki", "Toiki"));//untuk menambahkan semuanya

        // loop data
        for (String name: names){
            System.out.println(name);
        }
        //hapus
        System.out.println("++++++");
        names.remove("Seki");
        names.removeAll(Arrays.asList("Toiki","Nairi"));

        for (String name: names){
            System.out.println(name);
        }

        //cek ada datanya kgk
        System.out.println("++++++");
        System.out.println(names.contains("Oki"));
        System.out.println(names.containsAll(Arrays.asList("Seki","Toiki")));

        for (String name: names){
            System.out.println(name);
        }

        Collection<Person> persons = new ArrayList<>();
        persons.add(new Person(1,"Adi","Padang"));
        persons.add(new Person(2,"Yusuf","Medan"));
        persons.add(new Person(3,"Mithoha","Bandung"));
        persons.addAll( Arrays.asList(new Person(4,"Minantu","Bandung")));
        persons.addAll( Arrays.asList(
                new Person(5,"Aceng","Tasikmalaya"),
                new Person(6,"David","Medan")
        ));


        //tanya //collection kgk bisa diubah kecuali diubah dulu
//        persons.remove(persons(1,"Adi","Padang"));

//        persons.removeAll(Arrays.asList(
//                per
//        ));

        for (Person p: persons){
            System.out.println(p);
        }
        System.out.println(persons.contains("Oki"));
    }

}

