package numberClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MainScanner {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");

//        System.out.println("Masukkan nama : ");
//        String nama = scanner.nextLine();
        System.out.println("Masukkan tanggal lahir");
        String tglLahir = scanner.nextLine();
        Date tglLahirDate = formater.parse(tglLahir);
        System.out.println("tgl Lahir: "+tglLahirDate);

        System.out.println(tglLahir);
//        StringTokenizer past = new StringTokenizer(tglLahir,"-");
//        List<String> tglP = new ArrayList<>();
//        while (past.hasMoreTokens()){
//            String token = past.nextToken();
//            tglP.add(token);
//        }
//        System.out.println(tglP[0]);

        Date currentDate = new Date();

        String tglSekarang = formater.format(currentDate);
        System.out.println("Tgl Sekarang "+tglSekarang);

//        int umur = currentYear-tahunLahir;

        // hitung umur
        Calendar calendar = Calendar.getInstance();
        // tgl date => calender
        calendar.setTime(tglLahirDate);
        System.out.println("calender tgl lahir "+ calendar.getTime());
        Calendar currentCalendar = Calendar.getInstance();
        currentCalendar.setTime(new Date());
        // check calender sekarang
        System.out.println("tgl Sekarang "+ currentCalendar.getTime());
        // ambil selesih
        Long time = (currentCalendar.getTimeInMillis() - calendar.getTimeInMillis())/1000;
        System.out.println("Detik : "+time);
        // second => hour
        time = time/3600;
        System.out.println("Jam : "+time);
        // hour => day
        time = time/24;
        System.out.println("Hari : "+time);
        // day => week
        Long week = time/7;
        System.out.println("Minggu : "+week);
        // day => month
        long month = time/30;
        System.out.println("Month : "+time);
        // day => year
//        long year = (time / (24*3600))/365;
        long year = time/365;
        System.out.println("Year : "+year);
//        long year = (time / (24*3600))/365; //day to year
//        System.out.println("bentuk Year "+ (time / (24*3600))/365);

    }
}
