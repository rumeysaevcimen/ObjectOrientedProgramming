//decimalformat seklinde de yazabiliriz
//formulu dc.format 'a atayarak direkt cikti alabiliriz.

import java.util.Scanner;

public class Nsb5_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double kredi_miktari;
        System.out.println(("Kredi miktarını giriniz: "));
        kredi_miktari = scanner.nextDouble( );

        int yil;
        System.out.print("Kaç yıl vadeli: ");
        yil = scanner.nextInt( );

        double aylik_faiz_orani;
        System.out.print("Aylık faiz oranını giriniz: ");
        aylik_faiz_orani = scanner.nextDouble( );


        System.out.println("Aylık ödenecek miktar: " + (( aylik_faiz_orani * kredi_miktari) / (1 - (1 / Math.pow((1 + aylik_faiz_orani), yil * 12)))));
    }
}
