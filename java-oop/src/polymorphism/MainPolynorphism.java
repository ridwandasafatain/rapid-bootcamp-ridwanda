package polymorphism;

public class MainPolynorphism {
    public static void main(String[] args) {

        Employee employee = new Employee("Umi");
        Manager manager = new Manager("Ahmad");
        VicePresident vicePresident = new VicePresident("Joko");

        // call method
//        employee.sayHello();
//        manager.sayHello();
//        vicePresident.sayHello();
        sayHello(vicePresident);
        sayHello(manager);
        sayHello(employee);
    }
    
    public static void sayHello(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP "+ vicePresident.name);
        } else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello manager "+ manager.name);
        }else{
            System.out.println("Hello VP "+ employee.name);
        }
    }

}
