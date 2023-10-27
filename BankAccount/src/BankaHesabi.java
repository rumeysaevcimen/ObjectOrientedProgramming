public class BankaHesabi {
    private String hesapSahibi;
    private double paraMiktari;

    public BankaHesabi(){
        hesapSahibi = "Belirsiz";
        paraMiktari = 0.0;
    }

    public void paraEkle(double miktar){
        paraMiktari = paraMiktari + miktar;
    }

    public void paraCek(double miktar){
        paraMiktari = paraMiktari - miktar;
    }

    public String getHesapSahibi() {
        return hesapSahibi;
    }

    public double getParaMiktari(){
        return paraMiktari;
    }

    public void setHesapSahibi(String ad){
        hesapSahibi = ad;
    }

    public void setParaMiktari(double miktar){
        paraMiktari = miktar;
    }


}
