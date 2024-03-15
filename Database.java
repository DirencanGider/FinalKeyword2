import java.sql.SQLOutput;

public class Database {  //  1

    /*public void baglantiKur (final String username, final String password) {  /*  Basit bir metod yazdık.  //  2  //  Veri tiplerinin
                                                                                  başına final ekledik. Artık değiştirilemez
                                                                                  oldular. */  //  7

        //System.out.println(username);
        //System.out.println(password);

    //}

    // Bu seferde metodun başına final koyalım.  //  8

    public final void baglantiKur (String username, String password) {  //  9

        System.out.println(username);
        System.out.println(password);

    }

    // Şimdi Database2 adında yeni bir class oluşturarak bu class'ı extends edelim. Sonra da bu metodu override etmeye çalışalım.  //  10

}
