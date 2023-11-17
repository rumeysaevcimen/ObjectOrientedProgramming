import java.util.Scanner;
public class Volume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Soda paketinin fiyatını giriniz:  ");
        double paketFiyati = scanner.nextDouble();
        System.out.println("Soda şişesinin fiyatını giriniz: ");
        double sodaSisesiFiyati = scanner.nextDouble();
        final double PAKETTEKI_SODA_KUTUSU_ADEDI = 6;
        final double KUTU_HACMI = 0.355;
        final double SISE_HACMI = 2;

        double sodaKutuLitreFiyati = paketFiyati / (PAKETTEKI_SODA_KUTUSU_ADEDI * KUTU_HACMI);
        double sodaSisesiLitreFiyati = sodaSisesiFiyati / SISE_HACMI;

        System.out.printf("Paket litre fiyatı: %8.2f ", sodaKutuLitreFiyati);
        System.out.println();
        System.out.printf("Şişe litre fiyatı: %9.2f ", sodaSisesiLitreFiyati);
    }
}
