package logic;

public class LogicNo02 {
    public static void main(String[] args) {
        soalNo01(9);
    }

    public static void soalNo01(int n){
        String[][] kotak = new String[n][n];
        // isi array
        // baris
        for (int i = 0; i < n; i++) {
            int angka=1;
            // kolom
            for (int j = 0; j < n; j++) {
                if(i == j){
                    kotak[i][j] = String.valueOf(angka);
                }else if(i+j == n-1){
                    kotak[i][j] = String.valueOf(angka);
                }
                angka++;
            }
        }

        PrintArray.print(kotak);
    }
}


