package SetCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
//        names.add("Kaido");
//        names.add("Doffy");
        names.add("Tidur");
        names.add("Makan");
        names.add("Terbang");
        names.add("repeat");
        names.addAll(List.of("King", "Jack", "Trebol", "Pica"));

        System.out.println(names);
        System.out.println("Size :"+ names.size());

        Set<String> hobbies = new LinkedHashSet<>();
        hobbies.add("Tidur");
        hobbies.add("Makan");
        hobbies.add("Terbang");
        hobbies.add("repeat");

        System.out.println(hobbies);
        System.out.println("Size : "+hobbies.size());
    }
}
