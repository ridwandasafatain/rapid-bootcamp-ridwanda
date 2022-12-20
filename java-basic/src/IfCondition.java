import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        String input = scanner.next();
        int nilai = stringConverter(input);

        String grade = "";
        if(nilai>= 0 && nilai<= 20) grade = "E";
        else if(nilai>= 21 && nilai<= 40) grade = "D";
        else if(nilai>= 41 && nilai<= 60) grade = "C";
        else if(nilai>= 61 && nilai<= 80) grade = "B";
        else if(nilai>= 81 && nilai<= 100) grade = "A";

        System.out.println(grade);
    }

    public static Integer stringConverter (String input){
        int result = 0;
        try {
            result = Integer.parseInt(input);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    return result;
    }
}
