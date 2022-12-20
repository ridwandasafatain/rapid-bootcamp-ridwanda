public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student(1,"siti", "Wanita", "solo", 20, "Teknik", 1234);
        System.out.println(student1.toString());

        student1.sayHello();

    }
}