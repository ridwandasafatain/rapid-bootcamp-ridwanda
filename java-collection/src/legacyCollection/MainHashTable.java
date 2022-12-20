package legacyCollection;

import model.Transport;

import java.util.HashMap;
import java.util.Map;

public class MainHashTable {
    public static void main(String[] args) {
        Map<String, Transport> factory = new HashMap<>();
        factory.put("AT. Suka Maju", new Transport(1,"Public","Inoa",2));
        factory.put("YT. Maju lah", new Transport(3,"Private","Haira",2));
        factory.put("GT. Malas Terbang", new Transport(4,"Private","Naira",3));
        for(var entry : factory.entrySet()){
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }
        factory.remove("PT. Maju lah");

        System.out.println("\nsetelah diubah");
        for(var entry : factory.entrySet()){
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }
    }
}
