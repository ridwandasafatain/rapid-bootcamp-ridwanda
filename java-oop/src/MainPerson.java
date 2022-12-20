public class MainPerson {
    public static void main(String[] args) {
        // class - object - instance - constructor
        Person person1 = new Person();
        person1.id = 1;
        person1.name = "Roni";
        person1.address = "Ciamis";
        person1.gender = "Pria";
        person1.age = 30;
        person1.sayHello();

        Person person2 = new Person();
        person2.id = 2;
        person2.name = "Andre";
        person2.address = "Bandung";
        person2.gender = "Pria";
        person2.age = 25;
        person2.sayHello();

        Person person3 = new Person();
        person3.id = 3;
        person3.name = "Umi";
        person3.address = "Tegal";
        person3.gender = "Wanita Sholehah";
        person3.age = 20;
        person3.sayHello();
    }
}
