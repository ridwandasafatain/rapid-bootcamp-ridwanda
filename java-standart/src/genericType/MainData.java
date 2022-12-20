package genericType;

public class MainData {
    public static void main(String[] args) {
        Data data = new Data();
        data.setData("Umi Fikri");

        System.out.println("data Value: "+ data.getData());

        Data data1 = new Data();
        data1.setData(123456);
        System.out.println("data Value: "+ data1.getData());

        Data data2 = new Data();
        data2.setData(123456.1234);
        System.out.println("data Value: "+ data2.getData());

    }
}
