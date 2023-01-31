import java.util.Scanner;

public class Soru_10_VKE {
    public static void main(String[] args) {

        /*Soru 10-)  Klasik Soru :slightly_smiling_face:
                    Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın
                    **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) // If konusunu hatırlayın!***
                   Kullanıcıya aşağıdaki gibi mesaj verin:
                    Eğer VKİ 18.5'ten az ise --> zayıfsınız
                    Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
                    Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
                    VKİ 30'a eşit veya daha fazlaysa --> obez
                   ÖRNEK :
                 Ağırlık : 71
                Yükseklik : 1,72
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz");
        double kilo= scan.nextDouble();

        System.out.println("Lutfen boyunuzu giriniz");
        double boy= scan.nextDouble();

        double vke = kilo*10000/(boy*boy);
        System.out.println("Vucut Kitle Endeksiniz:" + vke);


        if (vke>30) System.out.println("Obezsiniz");
        else if (vke>=25) System.out.println("Sismansiniz");
        else if (vke>20) System.out.println("kilo ideal");
         else System.out.println("zayisiniz");


    }
}
