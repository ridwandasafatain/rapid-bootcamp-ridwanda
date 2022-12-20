public class IfNested {
    public static void main(String[] args) {

        nestedIf(10);
        nestedIf(15);
        nestedIf(0);

        paralelIf(15);
    }

    public static void nestedIf(int angka){
        if(angka > 0){
            // modulo => sisa hasil bagi
            if(angka % 2 == 0){
                int result = angka*4;
                System.out.println("Hasil : "+ result);
            }else {
                int result = angka * 3;
                System.out.println("Hasil : "+ result);
            }
        }else {
            System.out.println("Angka kurang dari 0");
        }
    }

    public static void paralelIf(int angka){
        if(angka > 0){
            System.out.println("Angka lebih dari 0");
        }

        if(angka % 2 == 0){
            System.out.println("Angka Genap");
        }else {
            System.out.println("Angka Ganjil");
        }

        if(angka / 2 >= 5){
            System.out.println("Angka 10 keatas");
        }else {
            System.out.println("Angka kurang dari 10");
        }
    }
}

