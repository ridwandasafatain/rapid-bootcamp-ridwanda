package logic.logic01;

public class Logic01_09 extends BasicLogic{
    public Logic01_09(int n) {
        super(n);
    }

    public void isiArray(){
        for (int i = 0; i < this.n; i++) {
            this.array[0][i] = String.valueOf((int) Math.pow((double)3.0, (double)i));
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
