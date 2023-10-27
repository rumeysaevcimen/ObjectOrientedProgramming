public class ElementTest {
    public static void main(String[] args) {

        Elementler element1 = new Elementler("Hidrojen", 1, "H", 1.008, 1, 1);
        Elementler element2 = new Elementler("Altın", 79, "Au", 197.0, 6, 11);
        Elementler element3 = new Elementler("Oksijen", 8, "0", 16.0, 2, 16);
        element1.elementYazdir();
        element2.elementYazdir();
        element3.elementYazdir();
}
}