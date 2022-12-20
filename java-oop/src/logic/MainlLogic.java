package logic;

import logic.logic01.*;
import logic.logic02.Logic02_01;

public class MainlLogic {
    public static void main(String[] args) {
        int x=10;
        System.out.println("Sample Logic 01 Soal 01");
        Logic01_01 logic01Soal01 = new Logic01_01(x);
        logic01Soal01.cetakArray();

        System.out.println("\n\nSample Logic 01 Soal 02");
        Logic01_02 logic01Soal02 = new Logic01_02(x);
        logic01Soal02.cetakArray();

        System.out.println("\n\nSample Logic 01 Soal 03");
        Logic01_03 logic01Soal03 = new Logic01_03(x);
        logic01Soal03.cetakArray();

        System.out.println("\n\nSample Logic 01 Soal 04");
        Logic01_04 logic01Soal04 = new Logic01_04(x);
        logic01Soal04.cetakArray();

        System.out.println("\n\nSample Logic 01 Soal 05");
        Logic01_05 logic01Soal05 = new Logic01_05(x);
        logic01Soal05.cetakArray();

        System.out.println("\n\nSample Logic 01 Soal 06");
        Logic01_06 logic01Soal06 = new Logic01_06(x);
        logic01Soal06.cetakArray();

        System.out.println("\n\nSample Logic 01 Soal 07");
        Logic01_07 logic01Soal07 = new Logic01_07(x);
        logic01Soal07.cetakArray();

        System.out.println("\n\nSample Logic 01 Soal 08");
        Logic01_08 logic01Soal08 = new Logic01_08(x);
        logic01Soal08.cetakArray();

        System.out.println("\n\nSample Logic 01 Soal 09");
        Logic01_09 logic01Soal09 = new Logic01_09(x);
        logic01Soal09.cetakArray();

        System.out.println("\n\nSample Logic 01 Soal 10");
        Logic01_10 logic01Soal10 = new Logic01_10(x);
        logic01Soal10.cetakArray();

        System.out.println("\n\nSample Logic 02 Soal 09");
        Logic02_01 logic02Soal09 = new Logic02_01(9);
        logic02Soal09.cetakArray();
    }

}
