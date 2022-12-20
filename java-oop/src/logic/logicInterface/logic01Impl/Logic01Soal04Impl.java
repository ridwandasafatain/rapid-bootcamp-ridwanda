package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal04Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal04Impl(BasicLogic logic){this.logic=logic;}

    public void isiArray(){
        for (int i = 0; i < this.logic.n; i++) {
            if (i != 1 && i != 0) {
                this.logic.array[0][i] = String.valueOf(Integer.valueOf(this.logic.array[0][i - 1]) + Integer.valueOf(this.logic.array[0][i - 2]));
            }else{
                this.logic.array[0][i] = String.valueOf(Integer.valueOf(1));
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
