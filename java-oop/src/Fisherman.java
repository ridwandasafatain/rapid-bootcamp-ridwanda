public class Fisherman extends  Person{
    public String specialist;
    public int averageCatch;
    public String operationLocation;

    public Fisherman(Integer id, String name, String gender, String address, int age, String specialist, int averageCatch, String operationLocation) {
        super(id, name, gender, address, age);
        this.specialist = specialist;
        this.averageCatch = averageCatch;
        this.operationLocation = operationLocation;
    }

}
