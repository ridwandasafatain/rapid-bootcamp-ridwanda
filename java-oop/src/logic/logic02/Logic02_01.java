package logic.logic02;

import logic.logic01.BasicLogic;

public class Logic02_01 extends BasicLogic {

    public Logic02_01(int n) {
        super(n);//constructor
    }

    public void isiArray(){
        for (int i = 0; i < this.n; i++) {
            int angka = 1;
            for (int j = 0; j < this.n; j++) {
                if(i==j || i+j ==this.n-1){
                    this.array[i][j] = String.valueOf(angka);
                }
                angka++;
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.print();
    }
}
