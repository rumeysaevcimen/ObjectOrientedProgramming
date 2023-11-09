public class RasyonelSayilarTest {
    public static void main(String[] args) {
        RasyonelSayilar r1 = new RasyonelSayilar();
        RasyonelSayilar r2 = new RasyonelSayilar();

        r1.setPay(3);
        r1.setPayda(5);

        r2.setPay(1);
        r2.setPayda(4);

        System.out.println(r1.esitMi(r2));
    }
}
