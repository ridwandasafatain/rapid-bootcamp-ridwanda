public class Ojek extends Person{
    public Integer noDriver;
    public String area;
    public String noHp;

    public Ojek(Integer id, String name, String gender, String address, int age, Integer noDriver, String area, String noHp) {
        super(id, name, gender, address, age);
        this.noDriver = noDriver;
        this.area = area;
        this.noHp = noHp;
    }
}
