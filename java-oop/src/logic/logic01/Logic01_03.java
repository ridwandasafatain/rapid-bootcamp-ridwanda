package logic.logic01;

public class Logic01_03 extends BasicLogic{
    public Logic01_03(int n){
        super(n);
    }
    public void isiArray(){
        this.array[0][0] = String.valueOf(0);
        for (int i = 1; i < this.n; i++) {
            this.array[0][i] = String.valueOf(Integer.valueOf(this.array[0][i - 1]) + 2);
        }
    }
    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
