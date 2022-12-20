package logic.logic01;

public class Logic01_01 extends BasicLogic{
    public Logic01_01(int n){
        super(n);
    }
    public void isiArray(){
        int angka = 1;
        for (int i = 0; i < this.n; i++) {
            this.array[0][i]= String.valueOf(angka);
            angka++;
        }

    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
