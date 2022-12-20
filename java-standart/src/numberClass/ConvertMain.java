package numberClass;

public class ConvertMain {
    public static void main(String[] args) {
        String angkaStr = "2354";
        Integer angka = Integer.parseInt(angkaStr);
        System.out.println(angka);

        angkaStr = "asc";
        try{
            angka = Integer.parseInt(angkaStr);
        }catch(Exception e){
            System.out.println("terjadi error saat: "+e.getMessage());
            angka=0;
        }

        System.out.println(angka);
    }
}
