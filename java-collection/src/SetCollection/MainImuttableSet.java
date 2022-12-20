package SetCollection;

import model.GenderEnum;

import java.util.EnumSet;
import java.util.Set;

public class MainImuttableSet {
    public static void main(String[] args) {
        Set<GenderEnum> gender = EnumSet.allOf(GenderEnum.class);
        System.out.println(gender);

        Set<String> immutSet = Set.of("Andika", "Sudirman","Hatta");
        immutSet.remove("Andika"); // error //karena collection gk bisa diubah
        immutSet.add("Roni"); // error
    }
}
