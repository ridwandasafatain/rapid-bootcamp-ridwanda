import java.util.Arrays;
import java.util.List;

public class Looping {
    public static void main(String[] args) {
        sample02(11);

        System.out.println();

        sample03(9);

        sample04();
    }

    public static void sample01(int n){
        for (int i=0; i <= n; i++){
            System.out.println(i);
        }
    }

    public static void sample02(int n){
        for (int i=0; i <= n; i++){
            if(i % 2 == 0){
                System.out.print("Fizz\t");
            }else {
                System.out.print(i + "\t");
            }
        }
    }

    public static void sample03(int n){
        for (int i=0; i < n; i++){
            for (int j=0; j < n; j++){
                System.out.print("["+i+","+j+"]\t");
            }
            System.out.println("\n");
        }
    }

    public static void sample04(){
        List<String> listString = Arrays.asList("Coding", "Reading", "Sport");
        System.out.println("List Of Hobby:");
        for(String item: listString){
            System.out.print(item+"\t");
        }

        System.out.println("List Of Number");
        List<Integer> listNumber = Arrays.asList(1,4,5,6,7,10);
        for (Integer item: listNumber){
            System.out.print(item+"\t");
        }
    }
}


