package logic.logic01;

public class Logic01_02 extends BasicLogic {
    public Logic01_02(int n){
        super(n);
    }
    public void isiArray(){
        this.array[0][0] = String.valueOf(1);
        this.array[0][1] = String.valueOf(3);
        for (int i = 2; i < this.n; i++) {
            if (i % 2 == 0) {
                this.array[0][i] = String.valueOf(Integer.valueOf(this.array[0][i - 2]) + 1);
            }else{
                this.array[0][i] = String.valueOf(Integer.valueOf(this.array[0][i - 2]) + 3);
            }
        }
    }
    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
