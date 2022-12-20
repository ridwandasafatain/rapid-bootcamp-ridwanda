package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal02Impl implements LogicInterface {
    private final BasicLogic logic;
    public Logic01Soal02Impl(BasicLogic logic){this.logic = logic;}

    public void isiArray(){
        this.logic.array[0][0] = String.valueOf(1);
        this.logic.array[0][1] = String.valueOf(3);
        for (int i = 2; i < this.logic.n; i++) {
            if (i % 2 == 0) {
                this.logic.array[0][i] = String.valueOf(Integer.valueOf(this.logic.array[0][i - 2]) + 1);
            }else{
                this.logic.array[0][i] = String.valueOf(Integer.valueOf(this.logic.array[0][i - 2]) + 3);
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
