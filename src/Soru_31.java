import java.util.Arrays;
import java.util.Scanner;

public class Soru_31 {
    public static void main(String[] args) {
         /* Kullanıcıdan Arrayin uzunlugunu isteyin.
        Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
        İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir array uzunlugu belirtiniz ");
        int arrayUzunlugu = scan.nextInt();
        scan.nextLine();

        String[] isimler = new String[arrayUzunlugu];

        for (int i = 0; i < isimler.length; i++) {

            System.out.println("Arrayin " + (i) + ". index degerini giriniz. ");
            isimler[i] = scan.nextLine();
        }
        System.out.print(Arrays.toString(isimler));
    }
}
