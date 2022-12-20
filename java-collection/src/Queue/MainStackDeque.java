package Queue;

import model.Transport;

import java.util.Deque;
import java.util.LinkedList;

public class MainStackDeque {
    public static void main(String[] args) {
        Deque<Transport> stack = new LinkedList<>();
        stack.offerLast(new Transport(1, "Public", "Bango", 4));
        stack.offerLast(new Transport(2, "Private", "Marjan", 3));
        stack.offerLast(new Transport(3, "Public", "Pop mie", 5));
//        for (var item = stack.pollLast(); item != null; item = stack.pollLast()) {
//            System.out.println(item);
//        }
//        for (Transport t : stack) {
//            System.out.println(t);
//        }
        stack.offerFirst(new Transport(4, "Public", "Monde", 4));
        System.out.println("\nsetelah diubah\n");

        for (var iten = stack.pollLast(); iten != null; iten = stack.pollLast()) {
                System.out.println(iten);
        }

//        for (Transport t : stack) {
//                System.out.println(t);
//        }
    }
}
