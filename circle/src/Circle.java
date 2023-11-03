public class Circle {
    private double yaricap;
    public static final int GECERSIZ_VERI = -1;

    public Circle(double r){
        setYaricap(r);
    }

    public double alanHesapla(){
        double sonuc = GECERSIZ_VERI;
        if(yaricapGecerlimi())
            sonuc = Math.PI * yaricap * yaricap;
        return sonuc;
    }

    public double cevreHesapla(){
        double sonuc = GECERSIZ_VERI;
        if(yaricapGecerlimi())
            sonuc = 2 * Math.PI * yaricap;
        return sonuc;
    }

    public double getYaricap() {
        return yaricap;
    }

    private boolean yaricapGecerlimi(){
        return yaricap != GECERSIZ_VERI;
    }

    public void setYaricap(double r){
        if (r > 0)
            yaricap = r;
        else
            yaricap = GECERSIZ_VERI;
    }
}
