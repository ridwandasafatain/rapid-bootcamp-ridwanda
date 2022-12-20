package genericType;

public class MainDataGeneric {
    public static void main(String[] args) {
        //tipe data - datanya apa
        DataGeneric<String> data1 = new DataGeneric<String>();
        data1.setData("Aoio Ae");
        System.out.println("data1 Value "+ data1.getData());

//        String value = data1.getData(); //gini juga bisa
//        System.out.println("data 1 value "+ value);

        //data1.setData(1234567); => error

        DataGeneric<Integer> data2 = new DataGeneric<Integer>();
        data2.setData(124321);
        System.out.println("data2 Value "+ data2.getData());
//
        DataGeneric<Boolean> data3 = new DataGeneric<Boolean>();
        data3.setData(true);
        System.out.println("data 3 Value "+ data3.getData());
//
        DataGeneric<Product> data4 = new DataGeneric<Product>();// tipe data class
//        data4.setData(new Product("Ajinomoto", (2500.00)));//cara pertama
        Product product = new Product("Obat Awet Muda",1000000.0);// cara kedua
        data4.setData(product);//cara kedua
        System.out.println("data 4 Value "+ data4.getData());

        //class generic
        DataGeneric<String> data5 = new DataGeneric<>("Data 5");
        System.out.println("Data 5 value :" + data5.getData());

        DataGeneric<Animal> data6 = new DataGeneric<>(new Animal("Naga", 9));
        System.out.println("Data 6 value :" + data6.getData());

        //method generic
        String[] names = {"a", "v", "r", "h"};
        Integer[] values = {3,5,7,9,5};
        System.out.println("Data 7 value :"+ DataGeneric.<String>count(names));
        System.out.println("Data 7 value :"+ DataGeneric.count(values));


//        DataGeneric<Animal> data5 = new DataGeneric<Animal>();
//        Animal animal = new Animal("")
    }
}
