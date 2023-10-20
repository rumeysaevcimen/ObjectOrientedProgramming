import java.util.*;

public class Nsb3{
    public static void main(String[] args) {
        Scanner girdi;
        girdi = new Scanner(System.in);

        String Ad;
        System.out.print("Adinizi giriniz; ");

        Ad = girdi.next( );
        System.out.println("Merhaba, "+ Ad + ".");

        String Soyad;
        System.out.print("Soyadinizi giriniz; ");

        Soyad = girdi.next();
        System.out.println("Soyadinizi giriniz; ");

        System.out.println("Adiniz " + Ad + " " + Soyad + ".");

    }
}