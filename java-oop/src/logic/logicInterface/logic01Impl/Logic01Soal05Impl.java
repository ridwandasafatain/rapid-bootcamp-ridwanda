package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal05Impl implements LogicInterface {
    private final BasicLogic logic;
    public Logic01Soal05Impl(BasicLogic logic){this.logic=logic;}
    public void isiArray(){
        for (int i = 0; i < this.logic.n; i++) {
            if (i != 0 && i != 1 && i != 2) {
                this.logic.array[0][i] = String.valueOf(Integer.valueOf(this.logic.array[0][i - 1]) + Integer.valueOf(this.logic.array[0][i - 2])+Integer.valueOf(this.logic.array[0][i - 3]));
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
