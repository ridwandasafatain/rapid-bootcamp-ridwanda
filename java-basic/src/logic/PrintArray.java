package logic;

public class PrintArray {
    public static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t\t");
        }
        System.out.println();
    }

    public static void print(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t\t");
        }
        System.out.println();
    }

    public static void print(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t\t");
            }
            System.out.println("\n");
        }
        System.out.println();
    }

    public static void print(String[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == null){
                    System.out.print("\t\t");
                }else {
                    System.out.print(array[i][j] + "\t\t");
                }
            }
            System.out.println("\n");
        }
        System.out.println();
    }
}


