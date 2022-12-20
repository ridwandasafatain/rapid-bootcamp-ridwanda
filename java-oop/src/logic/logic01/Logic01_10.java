package logic.logic01;

public class Logic01_10 extends BasicLogic{
    public Logic01_10(int n) {
        super(n);
    }

    public void isiArray(){
        for (int i = 0; i < this.n; i++) {
            this.array[0][i] = String.valueOf((int) Math.pow((double)i, (double)3.0));
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
