package polymorphism;

public class Employee {
    String name;
    Employee(String name){
        this.name=name;
    }
    void sayHello(){
        System.out.println("Hello Employee "+ this.name);
    }
}
