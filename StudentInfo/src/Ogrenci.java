import java.util.*;

public class Ogrenci {

   private String ad;
   private String soyad;
   private int numara;
   private Calendar tarih;

    public Ogrenci(String yeniAd, String yeniSoyad, int no) {
        ad = yeniAd;
        soyad = yeniSoyad;
        numara = no;
        tarih = Calendar.getInstance();
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getNumara() {
        return numara;
    }

    public void setAd(String yeniAd) {
        ad = yeniAd;
    }

    public void setSoyad(String yeniSoyad) {
        soyad = yeniSoyad;
    }

    public void setNumara(int a) {
        numara = a;
    }

    public int getTarih() {
        return tarih.getWeekYear();

    }

}
