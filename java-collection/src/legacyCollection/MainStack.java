package legacyCollection;

import model.Transport;

import java.util.Stack;


public class MainStack {
    public static void main(String[] args) {
        Stack<String> factory= new Stack<>();
//        factory.push(1,new factory())
        factory.push("pl");
        factory.push("4d");
        factory.push("lj");

//        for(var names = factory.pop(); names != null; names = factory.pop()){
//            System.out.println(names);
//        }
        System.out.println(factory.size());
        while(!factory.isEmpty()){
            System.out.println(factory.pop());
        }
//        for (int i = 0; i <= factory.size();i++){
//            System.out.println(i);
//            System.out.println(factory.pop());
//        }
//        System.out.println("The element at the top of the"
//                + " stack is: " + factory.peek());

    }
}
