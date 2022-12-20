package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal06Impl implements LogicInterface{
    private final BasicLogic logic;
    public Logic01Soal06Impl(BasicLogic logic){this.logic = logic;}

    public void isiArray(){
        int st = 1;
        int ed =10;
        int bil, bts = 0;
        for (int i=st; i<=ed; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                this.logic.array[0][bts] = String.valueOf(i);
                if (bts == this.logic.n-1) break;
                else {
                    bts++;
                    ed = (int)(Math.pow(ed, i));
                }
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
