import java.util.Scanner;

public class Soru_28 {

    public static void main(String[] args) {
        //Soru-28)
        //Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
        //Örnek:
        //      Sayı: 1238
        //      Sayının Tersi: 8321
        //İpucu:  Loop kullanabilirsiniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        String str = scan.next();
        String terstenStr="";


        for (int i =str.length()-1; i >=0 ; i--) {
            terstenStr+=str.substring(i,i+1);


        }
        System.out.println(terstenStr);



    }
}
