package logic.logic01;

public class Logic01_05 extends BasicLogic{
    public Logic01_05(int n) {
        super(n);
    }

    public void isiArray(){
        for (int i = 0; i < this.n; i++) {
            if (i != 0 && i != 1 && i != 2) {
                this.array[0][i] = String.valueOf(Integer.valueOf(this.array[0][i - 1]) + Integer.valueOf(this.array[0][i - 2])+Integer.valueOf(this.array[0][i - 3]));
            }else{
                this.array[0][i] = String.valueOf(Integer.valueOf(1));
            }
        }
    }
    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
