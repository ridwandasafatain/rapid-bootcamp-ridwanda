package legacyCollection;

import model.Transport;

import java.util.List;
import java.util.Vector;

public class MainVector {
    public static void main(String[] args) {
        List<String> factory = new Vector<>();
//        factory.add("PT. Suka-suka", new Transport(8,"Private","Rose", 6));
        factory.add("PT. Suka-suka");
        factory.add("PT.Cuma pt");
        System.out.println(factory);

        for (var pabrik : factory){
            System.out.println(pabrik);
        }
    }
}
