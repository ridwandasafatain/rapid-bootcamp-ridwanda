public class Jobless extends Person{
    public String position;
    public String jobdesk;
    public String hobby;
    public Integer bedTime;

    public Jobless(Integer id, String name, String gender, String address, int age, String position, String jobdesk, String hobby, Integer bedTime) {
        super(id, name, gender, address, age);
        this.position = position;
        this.jobdesk = jobdesk;
        this.hobby = hobby;
        this.bedTime = bedTime;
    }
}
