import java.util.Scanner;

public class soru_15 {

    public static void main(String[] args) {
        /* Soru 15-)
        Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
        -> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
        -> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
        Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
        Örn:
	     isim1= masa
         isim2= ali
	    Konsol => maalisa
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sirasiyla iki isim/kelime giriniz");
        String isim1=scan.nextLine();
        String isim2=scan.nextLine();

        if (isim1.length()%2==0) {
            System.out.println((isim1.substring(0, isim1.length() / 2) + (isim2) +
                    isim1.substring(isim1.length() / 2, isim1.length())));


        }else {
            System.out.println("Isim1 isim2'ye eklenemez");


        }




    }
}
