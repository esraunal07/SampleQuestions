import java.util.Scanner;

public class soru_11 {
    public static void main(String[] args) {
       /* Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                Ad ve soyadın baş harfleri büyük olmalıdır
        Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
                Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
        Giriş :
		 > Gandalf Grey 563245879632
        Çıktı :
		 > İsim : G****** G***
		 > CCN : **** **** 9632

        */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen ismininizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen Soyisminizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println("Lutfen kart numaranizi giriniz");
        String kartNo=scan.nextLine();

        String yenisim=isim.substring(0,1).toUpperCase()+isim.replaceAll("\\w", "*");
        String yeniSoyisim=soyisim.substring(0,1).toUpperCase()+soyisim.replaceAll("\\w", "*") ;
        String yenikartno=kartNo.substring(0,12).replaceAll("\\d","*") +kartNo.substring(12);

        if (kartNo.length()!=16) {
            System.out.println("Gecersiz kredi kart numarasi");
        }else{
            System.out.println("isim:" + yenisim+" "+yeniSoyisim+ "\n" +
                    "Kart no :"+ " "+yenikartno);
        }


    }
}
