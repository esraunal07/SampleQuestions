import java.util.Scanner;

public class soru_6_Cay_sekerHesaplama {
    public static void main(String[] args) {

        /*
        Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        1 şeker = 1.5 gr
        1 kg = 1000 gram      olarak hesaplayın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gündelik cay ve seker tüketiminizin miktarinizi giriniz");
        double bardak= scan.nextDouble();
        double seker = scan.nextDouble();
        double tuketilenseker=1.5 ;

        System.out.println("Yilda icilen cay: " + bardak*365 + "adet");
        System.out.println("Yilda tuketilen seker miktari:"+ (bardak*seker*tuketilenseker*365)/1000 + "kg");

       }






    }

