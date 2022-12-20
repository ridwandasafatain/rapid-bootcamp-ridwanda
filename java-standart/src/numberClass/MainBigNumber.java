package numberClass;

import java.math.BigDecimal;

public class MainBigNumber {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("12000000000");
        System.out.println("Number 1 :" +number1);
        BigDecimal number2 = new BigDecimal("14000000000");
        System.out.println("Number 2 :" +number2);
//        BigDecimal number3 = number1+number2; //error
        BigDecimal number3 = number1.add(number2);
        System.out.println("Add :" +number1);
        System.out.println("Multiple :"+number1.multiply(new BigDecimal(3)));
        System.out.println("Subtract :"+number2.subtract(number1));
        System.out.println("Devide :" +number2.divide(new BigDecimal(5)));

        Double doubleValue = number1.doubleValue();
        System.out.println("Double Value :"+doubleValue);
    }
}
