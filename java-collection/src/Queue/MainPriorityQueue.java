package Queue;

import model.Transport;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainPriorityQueue {
    public static void main(String[] args) {
//        Comparator<Transport> comparator = new NumberComparator();
//        PriorityQueue<Transport>  trasnports = new PriorityQueue<Transport>(Transport.getJenis(),NumberComparator);
        PriorityQueue<String>  transports = new PriorityQueue<>();
//        if (trasnports.offer(new Transport(1, "Public","Sedap" ,9))){
//            System.out.println("Queue is not full");
//        }else

//        transports.offer(new Transport(1, "Public","Sedap" ,9));
//        transports.offer(new Transport(2, "Private","Indofood" ,3));

        transports.offer("o");
        transports.offer("i");
        transports.offer("a");
        transports.offer("h");

//        for (Transport t: transports){
//            System.out.println(t);
//        }
        for (String  next = transports.poll(); next  != null; next = transports.poll()){
            System.out.println(next);
        }

        System.out.println(transports.size());
    }
}
