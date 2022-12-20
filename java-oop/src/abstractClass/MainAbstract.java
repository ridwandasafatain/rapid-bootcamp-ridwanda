package abstractClass;

public class MainAbstract {
    public static void main(String[] args) {
        //Location location = new Location();// ini gk bisa
        City city = new City();
        city.name = "Bandung City";
        System.out.println("City name : "+ city.name);
    }

}
