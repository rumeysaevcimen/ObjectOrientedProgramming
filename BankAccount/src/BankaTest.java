public class BankaTest {
    public static void main(String[] args) {

        BankaHesabi hesap = new BankaHesabi();
        hesap.setHesapSahibi("Rumeysa");
        hesap.setParaMiktari(10000);
        System.out.println("Para miktarı: " + hesap.getParaMiktari());
        hesap.paraCek(5000);
        System.out.println("Hesap Sahibi: " + hesap.getHesapSahibi());
        System.out.println("Para miktarı: " + hesap.getParaMiktari());

    }
}

