public class soru_23 {
    public static void main(String[] args) {

        /*
        Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın.
        Method bize çıktıyı döndürsün.
        Örnek:
        Girdi: 6
        Çıktı: 6!=65432*1=720
        ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
         */

        int input = 8;
        faktoryelHesapla(input);


    }

public static void faktoryelHesapla(int input){

        int faktoryelsonuc=1;
    for (int i = input; i>=1 ; i--) {

        faktoryelsonuc*=i;

    }
    System.out.println(faktoryelsonuc);
}




}
