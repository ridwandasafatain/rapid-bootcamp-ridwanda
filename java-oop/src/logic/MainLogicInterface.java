package logic;

import logic.logicInterface.LogicInterface;
//import logic.logicInterface.logic01Impl.Logic01Soal01Impl;
//import logic.logicInterface.logic01Impl.Logic01Soal02Impl;
import logic.logicInterface.logic01Impl.*;
import logic.logicInterface.logic02Impl.*;

public class MainLogicInterface {
    public static void main(String[] args) {

        int inp = 9;

        System.out.println("Logic 01 Soal 01");
        LogicInterface logic01Soal01 = new Logic01Soal01Impl(new BasicLogic(inp));
        logic01Soal01.cetakArray();

        System.out.println("\n\nLogic 01 Soal 02");
        LogicInterface logic01Soal02 = new Logic01Soal02Impl(new BasicLogic(inp));
        logic01Soal02.cetakArray();

        System.out.println("\n\nLogic 01 Soal 03");
        LogicInterface logic01Soal03 = new Logic01Soal03Impl(new BasicLogic(inp));
        logic01Soal03.cetakArray();

        System.out.println("\n\nLogic 01 Soal 04");
        LogicInterface logic01Soal04 = new Logic01Soal04Impl(new BasicLogic(inp));
        logic01Soal04.cetakArray();

        System.out.println("\n\nLogic 01 Soal 05");
        LogicInterface logic01Soal05 = new Logic01Soal05Impl(new BasicLogic(inp));
        logic01Soal05.cetakArray();

        System.out.println("\n\nLogic 01 Soal 06");
        LogicInterface logic01Soal06 = new Logic01Soal06Impl(new BasicLogic(inp));
        logic01Soal06.cetakArray();

        System.out.println("\n\nLogic 01 Soal 07");
        LogicInterface logic01Soal07 = new Logic01Soal07Impl(new BasicLogic(inp));
        logic01Soal07.cetakArray();

        System.out.println("\n\nLogic 01 Soal 08");
        LogicInterface logic01Soal08 = new Logic01Soal08Impl(new BasicLogic(inp));
        logic01Soal08.cetakArray();

        System.out.println("\n\nLogic 01 Soal 09");
        LogicInterface logic01Soal09 = new Logic01Soal09Impl(new BasicLogic(inp));
        logic01Soal09.cetakArray();

        System.out.println("\n\nLogic 01 Soal 10");
        LogicInterface logic01Soal10 = new Logic01Soal10Impl(new BasicLogic(inp));
        logic01Soal10.cetakArray();

//        System.out.println("\n\nLogic 02 Soal 01");
//        LogicInterface logic02Soal01 = new Logic02Soal01Impl(new BasicLogic(inp));
//        logic02Soal01.cetakArray();
//
        System.out.println("\n\nLogic 02 Soal 01");
        LogicInterface logic02Soal01 = new Logic02Soal01Impl(new BasicLogic(inp));
        logic02Soal01.cetakArray();

        System.out.println("\n\nLogic 02 Soal 02");
        LogicInterface logic02Soal02 = new Logic02Soal02Impl(new BasicLogic(inp));
        logic02Soal02.cetakArray();

        System.out.println("\n\nLogic 02 Soal 03");
        LogicInterface logic02Soal03 = new Logic02Soal03Impl(new BasicLogic(inp));
        logic02Soal03.cetakArray();

        System.out.println("\n\nLogic 02 Soal 4");
        LogicInterface logic02Soal04 = new Logic02Soal04Impl(new BasicLogic(inp));
        logic02Soal04.cetakArray();

        System.out.println("\n\nLogic 02 Soal 5");
        LogicInterface logic02Soal05 = new Logic02Soal05Impl(new BasicLogic(inp));
        logic02Soal05.cetakArray();

        System.out.println("\n\nLogic 02 Soal 9");
        LogicInterface logic02Soal09 = new Logic02Soal09Impl(new BasicLogic(inp));
        logic02Soal09.cetakArray();

        System.out.println("\n\nLogic 02 Soal 10");
        LogicInterface logic02Soal10 = new Logic02Soal10Impl(new BasicLogic(inp));
        logic02Soal10.cetakArray();

        System.out.println(9/2);
    }
}
