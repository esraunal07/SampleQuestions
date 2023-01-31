package GrupCalismalari;

import java.util.*;

public class Date170123_2 {
    public static void main(String[] args) {


        // 3) Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
        // Örnek: ‘Mississippi’ ´ Misp

        String str="Missimssmipj kpi";
        farkliKarakterleriYazdir(str);
    }

    private static void farkliKarakterleriYazdir(String str) {

        Set<String> farkliKarakter= new TreeSet<>();

        for (int i = 0; i <str.length() ; i++) {
            farkliKarakter.add(str.substring(i,i+1));
        }
        System.out.println(farkliKarakter);
    }
}

echo "# SampleQuestions" >> README.md
        git init
        git add README.md
        git commit -m "first commit"
        git branch -M main
        git remote add origin https://github.com/esraunal07/SampleQuestions.git
        git push -u origin main