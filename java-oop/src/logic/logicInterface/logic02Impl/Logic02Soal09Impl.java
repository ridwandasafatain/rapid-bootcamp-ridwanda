package logic.logicInterface.logic02Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic02Soal09Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic02Soal09Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int a = 1;
        int nilaiTengah = this.logic.n/2;
        for (int i = 0; i < this.logic.n; i++) {
            for (int j = 0; j < this.logic.n; j++) {
                if(j-i <= nilaiTengah && i-j <= nilaiTengah &&
                        i+j >= nilaiTengah && i+j <= nilaiTengah + this.logic.n-1 ){
                    this.logic.array[i][j] = String.valueOf(a);
                    a+=2;
                }
            }
        }
    }
    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print();
    }
}
