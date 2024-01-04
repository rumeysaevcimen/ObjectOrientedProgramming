import java.util.Scanner;

public class EnYakinNoktalariBulma {
    public static void main(String[] args) {
        System.out.println("Kaç adet nokta gireceksiniz? ");
        Scanner scanner = new Scanner(System.in);
        int noktaSayisi = scanner.nextInt();

        int[][] noktalar = new int[noktaSayisi][2];
        System.out.println(noktaSayisi + " adet nokta giriniz:");
        for (int i = 0; i < noktaSayisi; i++) {
            noktalar[i][0] = scanner.nextInt();
            noktalar[i][1] = scanner.nextInt();
        }

        int n1 = 0, n2 = 1;
        //double uzaklik = 0;
        double enKisaMesafe = uzaklikBul(noktalar[0][0], noktalar[0][1], noktalar[1][0], noktalar[1][1]);
        System.out.println(enKisaMesafe);
        for (int i = 1; i < noktaSayisi; i++) {
            for (int j = i + 1; j < noktaSayisi; j++) {
                double uzaklik = uzaklikBul(noktalar[i][0], noktalar[i][1], noktalar[j][0], noktalar[j][1]);
                System.out.println(uzaklik);
                if (uzaklik > enKisaMesafe) {
                    n1 = i;
                    n2 = j;
                    enKisaMesafe = uzaklik;
                }
            }
        }
        System.out.println("En kısa mesafeye sahip noktalar: " + "(" + noktalar[n1][0] + noktalar[n1][1] + "," +
                noktalar[n1][1] + ")" + " (" + noktalar[n2][0] + "," + noktalar[n2][1] + ")");
    }
        public static double uzaklikBul ( int x1, int y1, int x2, int y2){
            double deger = Math.sqrt(((x1 - x2)*(x1 - x2)) + ((y1 - y2)*(y1 - y2)));
            return deger;


    }
}
