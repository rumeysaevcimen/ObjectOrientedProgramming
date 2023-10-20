//pow(a, b) = pow(2.0, 3.0) - 2 uzeri 3 anlamina gelir.//
//abs = mutlak deger//

import java.util.*;

public class Nsb4_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int santigrat;
        System.out.print("Santigrat giriniz: ");
        santigrat = scanner.nextInt( );

        System.out.println("Fahrenheit: " + (1.8 * santigrat + 32));

    }
}