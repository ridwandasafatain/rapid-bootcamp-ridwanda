public class Soal {
    public static void main(String[] args) {
//        soal1(9);
//        System.out.println("_______");
//        soal2(9);
//        System.out.println("_______");
//        soal3(9);
//        System.out.println("_______");
        soal5(9);
    }

    public static void soal1(int n){
        for(int i= 1; i<=n; i++){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
    public static void soal2(int n){
        int a=0, b = 0;
        for(int i=0; i<n; i++){
            if(i%2==0){
                a++;
                System.out.print(a + " ");
            }
            else {
                b = b+3;
                System.out.print(b + " ");
            }
        }
        System.out.println(" ");
    }

    public static void soal3(int n){
        for(int i=0; i<n; i++){
           int nilai = i*2;
            System.out.print(nilai+ " ");
        }
    }

    public static void soal4(int n){
        int past = 1;
        int current = 1;
        int jumlah = 1;
        for (int i =1; i <= n; i++){
            if(i==2) {
                jumlah =1;
                System.out.print(jumlah + "\t");
            }
            else {
                System.out.print(current + " ");
                jumlah = past + current;
                past = current;
                current = jumlah;
            }
        }
    }

    public static void soal5(int n){
        int seb2 = 1,seb = 1, sek = 1;
        int angka = 0;
        for (int i=0; i<n; i++){
            if(i==1||i==2||i==0){
                angka = 1;
                System.out.print(angka + "\t");
            }
            else {
                angka = sek + seb + seb2;
                seb = sek;
                seb2 = seb;
                sek = angka;

                System.out.print(angka + "\t");
            }
        }

    }
}
