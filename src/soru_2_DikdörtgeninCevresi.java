import java.util.Scanner;

public class soru_2_DikdörtgeninCevresi {

    public static void main(String[] args) {

        /*
         SOUT/SYSO
         Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
         Ipuclari:
         * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
         * Dikdortgenin Alani : uzun kenar * kisa kenar
         */

        Scanner scan=new Scanner(System.in) ;
        System.out.println("Lutfen dikdörtgenin kenar uzunluklarini giriniz");
        double kisakenar= scan.nextDouble();
        double uzunkenar= scan.nextDouble();

        System.out.println("Dikdörtgenin Cevresi:"+ 2*(uzunkenar+kisakenar) + ("\nDikdörtgenin Alani:" + uzunkenar*kisakenar));


        }



    }

