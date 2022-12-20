package logic.logicInterface.logic02Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic02Soal05Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic02Soal05Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        for(int i = 0; i< this.logic.n; i++){
            for(int j = 0; j< this.logic.n; j++){
                if(i == this.logic.n/2 && j <= 2) {
                    this.logic.array[i][j] = String.valueOf(1);
                }
                else if(i == this.logic.n/2) {
                    this.logic.array[i][j] = String.valueOf(Integer.parseInt(this.logic.array[i][j-1]) + Integer.parseInt(this.logic.array[i][j-2]) +  Integer.parseInt(this.logic.array[i][j-3]));
                }
            }
        }

        for(int i = 0; i< this.logic.n; i++){
            for(int j = 0; j< this.logic.n; j++){
                if (j <= i && j <= this.logic.n/2 && i <= this.logic.n/2|| j >= i && j >= this.logic.n/2 && i >= this.logic.n/2 || j <= i && i >= this.logic.n/2 && j <= this.logic.n-i-1 || j >= i && i <= this.logic.n/2 && j >= this.logic.n-i-1){
                    this.logic.array[i][j] = this.logic.array[this.logic.n/2][j];
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
