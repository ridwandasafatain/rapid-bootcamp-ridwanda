package Sorting;

import Map.TransportComparator;
import model.Transport;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainSortingList {
    public static void main(String[] args) {
        List<Transport> kendaraan = new ArrayList<>();
        kendaraan.addAll(List.of(
                new Transport(2,"Public","Aira",3),
                new Transport(1,"Private","Koira",4),
                new Transport(4,"Ae","Goiji",2)
        ));
        Collections.sort(kendaraan, new TransportComparator());
        System.out.println(kendaraan);


    }
}
