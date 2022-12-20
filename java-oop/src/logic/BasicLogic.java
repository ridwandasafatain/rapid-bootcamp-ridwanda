package logic;

public class BasicLogic {
    // BAKUL
    // Baca Ketik Ulangi (5x)
    public int n;
    public String[][] array;

    public BasicLogic(int n) {
        this.n = n;
        this.array = new String[n][n];
    }

    public void print(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(this.array[i][j] != null) {
                    System.out.print(this.array[i][j] + "\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println("\n");
        }
    }

    public void printSingle(){
        for (int i = 0; i < n; i++) {
            System.out.print(array[0][i]+"\t");
        }
    }
}
