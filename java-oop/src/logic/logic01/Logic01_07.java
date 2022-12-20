package logic.logic01;

public class Logic01_07 extends BasicLogic {
    public Logic01_07(int n) {
        super(n);
    }

    public void isiArray(){
        char it = 'A';
        for (int i = 0; i < this.n; i++) {
            this.array[0][i] = String.valueOf(it);
            it++;
        }
    }
    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
