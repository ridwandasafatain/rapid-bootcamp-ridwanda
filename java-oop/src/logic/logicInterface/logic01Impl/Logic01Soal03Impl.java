package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal03Impl implements LogicInterface {

    private final BasicLogic logic;

    public Logic01Soal03Impl(BasicLogic logic){this.logic = logic;}

    public void isiArray(){
        this.logic.array[0][0] = String.valueOf(0);
        for (int i = 1; i < this.logic.n; i++) {
            this.logic.array[0][i] = String.valueOf(Integer.valueOf(this.logic.array[0][i - 1]) + 2);
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
