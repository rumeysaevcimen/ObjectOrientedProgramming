import java.util.Scanner;

public class FibonacciHesabiProgrami {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("N değeri giriniz: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci dizisindeki " + n + ". Fibonacci sayısı: " +
                (int) ((1 / Math.sqrt(5)) * (Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n))));


    }

}
