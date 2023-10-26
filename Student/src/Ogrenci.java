public class Ogrenci {

   private String ad;
   private String soyad;
   private int numara;

    public Ogrenci( ) {
        ad = "bilinmiyor";
        soyad = "bilinmiyor";
        numara = 0;
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
    

}
