public class Animal {
    private String turAdi;
    private int populasyon;
    private double buyumeOrani;

    public Animal(String turAdi, int populasyon, double buyumeOrani) {
        this.turAdi = turAdi;
        this.populasyon = populasyon;
        this.buyumeOrani = buyumeOrani;
    }

    public void setTurAdi(String turAdi) {
        this.turAdi = turAdi;
    }

    public void setPopulasyon(int populasyon) {
        this.populasyon = populasyon;
    }

    public void setBuyumeOrani(double buyumeOrani) {
        this.buyumeOrani = buyumeOrani;
    }

    public String getTurAdi() {
        return turAdi;
    }

    public int getPopulasyon() {
        return populasyon;
    }

    public double getBuyumeOrani() {
        return buyumeOrani;
    }

    public boolean nesliTehlikede() {
        return buyumeOrani < 0;
    }

    public static void main(String[] args) {
        Animal kaplan = new Animal("Kaplan", 2500, -5.2);
        Animal panda = new Animal("Panda", 1864, 2.8);

        System.out.println("Kaplan nesli tükenmekte: " + kaplan.nesliTehlikede());
        System.out.println("Panda nesli tükenmekte: " + panda.nesliTehlikede());

        kaplan.setPopulasyon(2000);
        panda.setPopulasyon(1000);
        System.out.println("Yeni kaplan popülasyonu: " + kaplan.getPopulasyon());
        System.out.println("Yeni panda popülsayonu: " + panda.getPopulasyon());
    }
}