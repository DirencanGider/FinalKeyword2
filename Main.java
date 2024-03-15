public class Main {
    public static void main(String[] args) {  //  3

        Database database = new Database();  //  4
        database.baglantiKur("root","12345");  //  5

        /*  Şimdi biz bu constructorda belirlediğimiz özelliklerin tekrar değişmesini istemiyorsak, constructoru yazılmış olan
            yere girederek constructor parantezi içerisindeki veri tiplerinin başına final anahtar kelimesini koyduğumuz zaman
             sorun çözülecek demektir. */  //  6


    }
}
