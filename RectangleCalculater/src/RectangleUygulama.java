public class RectangleUygulama {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("Dikdörtgenin çevresi: " + rect1.cevreHesapla());
        rect1.setEn(5);
        rect1.setBoy(4);
        System.out.println("Dikdörtgenin çevresi: " + rect1.cevreHesapla());
        double a = rect1.getBoy();
        double b = rect1.getEn();
        System.out.println("Çevre: " + 2 * (a + b));
    }
}
