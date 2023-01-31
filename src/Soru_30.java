import java.util.Arrays;

public class Soru_30 {
    public static void main(String[] args) {

        /* Soru 30-) Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
        Örnek:
        String str="Javacokkolay"
        Yinelenen karakterler : [a, o, k]
        İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
        Stringdeki bir harfi Stringde bulunan diger harfler ile karşılaştırıp
        konteynıra atacaksınız bu yüzden iç içe loop kullanmak mantıklı duruyor.
         */

        String str = "Java cok kolay";

        String tekrarKarakter = "";
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.substring(i, i + 1).equalsIgnoreCase(str.substring(j, j + 1)))
                    if (!tekrarKarakter.contains(str.substring(j, j + 1))) {
                        tekrarKarakter += str.substring(j, j + 1);
                    }
            }
            String[] karakterler = tekrarKarakter.split("");
            System.out.println(Arrays.toString(karakterler));

        }
    }
}
