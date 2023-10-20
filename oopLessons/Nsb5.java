//,

import java.util.Scanner;

public class Nsb5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int fiyat;
        System.out.print("Fiyatını giriniz: ");
        fiyat = scanner.nextInt( );

        System.out.println("Kdv: " + (fiyat * 0.18));

    }
}
