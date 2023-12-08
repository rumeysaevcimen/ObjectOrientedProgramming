import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class YasGirTest {
    public static void main(String[] args) {
        GregorianCalendar bugun;
        int yas, buYil, dogumYili;
        String yanit;
        Scanner scanner = new Scanner(System.in);
        YasGir girdi = new YasGir();
        yas = girdi.getYas("Yaşınız kaç?");
        bugun = new GregorianCalendar();
        buYil = bugun.get(Calendar.YEAR);
        dogumYili = buYil - yas;
        System.out.println("Doğum yılınız bu mu? (E ya da H)");
        yanit = scanner.next();
        if(yanit.equals("H") || yanit.equals("h")){
            dogumYili--;
        }
        System.out.println("Doğum yılınız: " + dogumYili);

    }
}
