public class ZarTest {
    public static void main(String[] args) {

        ZarAtma zar01 = new ZarAtma();

        zar01.zarAt();
        System.out.println("İlk zar atışı: " + zar01.getSayi());

        zar01.zarAt();
        System.out.println("İkinci zar atışı: " + zar01.getSayi());

        zar01.zarAt();
        System.out.println("Üçüncü zar atışı: " + zar01.getSayi());

    }
}
