package logic.logic01;

public class Logic01_08 extends BasicLogic{
    public Logic01_08(int n) {
        super(n);
    }

    public void isiArray(){
        char it = 'A';
        int co = 2;
        for (int i = 0; i < this.n; i++) {
            if (i % 2 ==0) {
                this.array[0][i] = String.valueOf(it);
            }else {
                this.array[0][i] = String.valueOf(co);
                co+=2;
            }
            it++;
        }
    }
    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }

}
