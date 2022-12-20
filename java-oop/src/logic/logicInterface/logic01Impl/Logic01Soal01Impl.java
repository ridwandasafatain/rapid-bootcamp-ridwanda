package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal01Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal01Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int angka = 1;
        for (int i = 0; i < this.logic.n; i++) {
            this.logic.array[0][i]= String.valueOf(angka);
            angka++;
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
