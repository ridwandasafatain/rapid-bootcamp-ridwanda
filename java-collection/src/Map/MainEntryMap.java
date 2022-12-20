package Map;

import model.Transport;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainEntryMap {
    public static void main(String[] args) {
        Map<Integer, Transport> owners = new HashMap<>();

//        owners.put("1", "a");
//        owners.put("2", "v");
//        owners.put("3", "f");
//        owners.put("4", "p");
        owners.put(4, new Transport(8,"Private","Rose", 6));
        owners.put(1, new Transport(7,"Private","Xiaomi", 2));
        owners.put(5, new Transport(6,"Public","Rose", 2));
        owners.put(3, new Transport(5,"Private","Rose", 4));

//        Set<Map.Entry<Integer, Transport>> entries = owners.entrySet();


        owners.forEach((k, v) -> {
            System.out.println("Key: " + k + ", Value: " + v);
        });

        for (Map.Entry<Integer, Transport> entry : owners.entrySet()) {
            String k = String.valueOf(entry.getKey());
            String v = String.valueOf(entry.getValue());
            System.out.println("Key: " + k + ", Value: " + v);
        }

//        for (var entry = entries){
//            System.out.println("====");
//            System.out.println("Key : "+entry.getKey());
//            System.out.println("Value : "+entry.getValue());
//        }
    }
}
