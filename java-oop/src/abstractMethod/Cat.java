package abstractMethod;

public class Cat extends Animal{
    public Cat(String name){
        this.name = name;
    }

    @Override
    void run() {
        System.out.println("The cat "+name +", can run");
    }

    @Override
    void canEat() {
        System.out.println("The can eat meal");
    }
}
