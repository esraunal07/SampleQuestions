import java.util.Scanner;

public class soru_3_ortalamaHesaplama {

    public static void main(String[] args) {

        /*
        Soru 3-)   SCANNER
        Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
        Ipuclari:
        * Sayilarin ortalamasi: toplam/5
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 tane sayi giriniz");

        double sayi1= scan.nextInt();
        double sayi2= scan.nextInt();
        double sayi3= scan.nextInt();
        double sayi4= scan.nextInt();
        double sayi5= scan.nextInt();
        double toplam= sayi1+sayi2+sayi3+sayi4+sayi5 ;
        System.out.println("Sayilarin Ortalamasi: " + (toplam/5));

        System.out.println(" * * * * * * * * *");

        // forloop cozumu
        System.out.println("Lutfen 5 tane sayi giriniz");
        int toplam2 =0;
        for (int i = 1; i <6; i++) {
            int sayi= scan.nextInt();
            toplam2= sayi+toplam2 ;
        }
        System.out.println("Sayilarin Ortalamasi :" + (toplam2/5));









    }
}
