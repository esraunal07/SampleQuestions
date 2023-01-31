import java.util.Scanner;

public class soru_8 {
    public static void main(String[] args) {

/*
             Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
                Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
                ipuclari:
                Matematiksel Islemler konusuna bakalim. Bölme islemi kullanarak sayinin basamaklarini
                alalim ve toplam adli bir konteynira (Variable) atalim. (edited)
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz");
        int girilensayi= scan.nextInt();
        int birlerbasamagi=0;
        int rakamlartoplami=0;

        birlerbasamagi=girilensayi%10 ;
        rakamlartoplami=rakamlartoplami+birlerbasamagi;

        girilensayi=girilensayi/10;
        birlerbasamagi=girilensayi%10;
        rakamlartoplami=rakamlartoplami+birlerbasamagi;

        girilensayi=girilensayi/10;
        birlerbasamagi=girilensayi%10;
        rakamlartoplami=rakamlartoplami+birlerbasamagi;

        System.out.println("Girilen sayinin rakamlar toplami: " + rakamlartoplami);
















    }
}
