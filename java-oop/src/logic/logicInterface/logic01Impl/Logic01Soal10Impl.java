package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal10Impl implements LogicInterface {
    private final BasicLogic logic;
    public Logic01Soal10Impl(BasicLogic logic){this.logic=logic;}

    public void isiArray(){
        for (int i = 0; i < this.logic.n; i++) {
            this.logic.array[0][i] = String.valueOf((int) Math.pow((double)i, (double)3.0));
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
