import java.util.Scanner;

public class BolmeIslemi {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Payı giriniz: ");
            int pay = scanner.nextInt();
            System.out.println("Paydayı giriniz: ");
            int payda = scanner.nextInt();
            if (payda == 0)
                throw new DivisionByZeroException();
            double bolum = pay / (double) payda;
            System.out.println(pay + "/" + payda + "=" + bolum);
        } catch (DivisionByZeroException e) {
            System.out.println("Payda sıfırdan farklı olmalı!");
            ikinciSans();
        }

    }
    public static void ikinciSans(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Payı giriniz: ");
        int pay = scanner.nextInt();
        System.out.println("Paydayı giriniz: ");
        int payda = scanner.nextInt();
        double bolum = pay / (double) payda;
        System.out.println(pay + "/" + payda + "=" + bolum);

    }
}
