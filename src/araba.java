public class araba {


    // Soru 43-)
    // Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
    // Bu const. kullanarak en az 2 nesne oluşturun ve
    // konsolda bu nesnelerin özellikleri yazdırın
    // Ipucu: Constructor konusunu pratik yapalım.
    // Nesnelerin rengini adını sayısını gönderelim
    // sonra cagırıp konsolda yazdıralım.

    String marka = "Tesla";
    int model = 2022;

    String renk = "Kirmizi";
    static String renk2 = "Sari";

    araba() {
        marka = "bmw";
        model=2010;


    }
public String toString(){

    return "Araba{" +
            "marka='" + marka + '\'' +
            ", model=" + model +
            ", renk='" + renk + '\'' +
            '}';
}

    public araba(String marka, int model, String renk) {

        this.marka = marka;
        this.model = model;
        this.renk = renk;

    }

    public static void main(String[] args) {
        araba a1=new araba();

        System.out.println(a1);

        araba a2=new araba("toyota",2007,"kahverengi");

        System.out.println(a2);

        System.out.println(a1);

        System.out.println(araba.renk2);

    }
}


