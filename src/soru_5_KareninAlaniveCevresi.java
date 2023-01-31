import java.util.Scanner;

public class soru_5_KareninAlaniveCevresi {
    public static void main(String[] args) {

        /*
        Soru 5-)   SCANNER
            Kullanıcıdan karenin kenar uzunluğunu alın.
            Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
         */

        Scanner scan=new Scanner(System.in) ;
        System.out.println("Lutfen karenin kenar uzunlugunu giriniz");
         int kenar=scan.nextInt();

        System.out.println("Karenin alani:"+ kenar*kenar + "\nKarenin cevresi :" + kenar*4);








    }
}
