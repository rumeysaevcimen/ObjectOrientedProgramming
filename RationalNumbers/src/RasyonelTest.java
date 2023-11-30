public class RasyonelTest {
    public static void main(String[] args) {
        RasyonelSayilar r1, r2, r3, r4, r5;
        r1 = new RasyonelSayilar(24, 36);
        r3 = new RasyonelSayilar(1, 3);
        r4 = r1.topla(r3);
        r5 = r4.sadelestir();

        System.out.println(r5.toString());
    }
}
