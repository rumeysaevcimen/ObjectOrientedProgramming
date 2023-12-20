import java.util.Scanner;

public class StandartSapma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sayının standart sapmasını hesaplamak istiyorsunuz? -> ");
        int N = scanner.nextInt();

        double[] sayilar = new double[N];
        double toplam = 0;

        System.out.println(N + " adet sayıyı giriniz:");
        for (int i = 0; i < N; i++) {
            System.out.print("Sayı " + (i + 1) + ": ");
            sayilar[i] = scanner.nextDouble();
            toplam += sayilar[i];
        }

        double ortalama = toplam / N;
        double toplamKareFark = 0;

        for (int i = 0; i < N; i++) {
            toplamKareFark += Math.pow(sayilar[i] - ortalama, 2);
        }

        double standartSapma = Math.sqrt(toplamKareFark / N);

        System.out.println("Girilen sayıların standart sapması: " + standartSapma);
    }
}
