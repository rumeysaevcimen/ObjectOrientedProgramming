import java.util.Random;

public class ZarAtma {
    private static final int  EN_BUYUK_SAYI = 6;
    private static final int EN_KUCUK_SAYI = 1;
    private static final int GECERSIZ_SAYI = 0;

    private int sayi;

    private Random rastgele;

    public ZarAtma(){
        rastgele = new Random();
        zarAt();
    }

    public void zarAt(){
        sayi = rastgele.nextInt(EN_BUYUK_SAYI - EN_KUCUK_SAYI + 1) + EN_KUCUK_SAYI;
    }

    public int getSayi(){
        return sayi;
    }
}
