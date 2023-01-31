package GrupCalismalari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Date170123_3 {
    public static void main(String[] args) {

        /*
        Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir. Her giriş satırındaki ilk
        ve son sözcükler dışındaki sözcüklerin sırasını tersine çevirip sözcükleri değiştirmeden
        kodu yazınız.
        Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
        Örnek; Kemal Can Tan  Han Kuzu, Kemal Han  Tan Can Kuzu'ya dönüşecektir
        */


            String isimler ="Kemal "+"Can "+"Cemil "+"Tan "+"Han "+"Kuzu  ";
            String [] isimlerArr=isimler.split(" ");
            System.out.println(Arrays.toString(isimlerArr));


            String yeniDuzen=isimlerArr[0]+" ";

            for (int i =isimlerArr.length-2; i > 0; i--) {

                yeniDuzen=yeniDuzen.concat(isimlerArr[i]+" ");

            }

            yeniDuzen=yeniDuzen+isimlerArr[isimlerArr.length-1];


            System.out.println(yeniDuzen);



        }

}
