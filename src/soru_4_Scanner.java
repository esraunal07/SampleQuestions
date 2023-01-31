import java.util.Scanner;

public class soru_4_Scanner {

    public static void main(String[] args) {

        /*
        Soru 4-)   SCANNER
        Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.
        Ipuclari:
        * Sayinin küpü: sayi*sayi*sayi
         */
        Scanner scan=new Scanner(System.in) ;
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        System.out.println("Sayinin kupunun yarisi: " + (sayi*sayi*sayi)/2 );
       ;







    }
}
