package logic.logic01;

public class Logic01_04 extends BasicLogic{

    public Logic01_04(int n) {
        super(n);
    }
    public void isiArray(){
        for (int i = 0; i < this.n; i++) {
            if (i != 1 && i != 0) {
                this.array[0][i] = String.valueOf(Integer.valueOf(this.array[0][i - 1]) + Integer.valueOf(this.array[0][i - 2]));
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
