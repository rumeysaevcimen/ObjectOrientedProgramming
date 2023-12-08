import java.util.InputMismatchException;
import java.util.Scanner;

public class YasGir {
    private static final String VARSAYILAN_MESAJ = "Yaşınız: ";
    private Scanner scanner;
    public void YasGir(){
        scanner = new Scanner(System.in);
    }
    public int YasGir(scanner = new Scanner(System.in)){
        return getYas(VARSAYILAN_MESAJ);

    public int getYas(){
        return getYas(VARSAYILAN_MESAJ);
    }
    public int getYas(String mesaj){
            System.out.print(mesaj);
            int yas = 0;
            while (true) {
                try {
                    yas = scanner.nextInt();
                    if (yas < 0) {
                        throw new Exception("Negatif değer girildi!");
                    }
                    return yas;
                } catch (InputMismatchException e) {
                    scanner.next();
                    System.out.println("Geçersiz girdi, lütfen yaşınızı tamsayı olarak giriniz: ");
                } catch (Exception e) {
                    System.out.println("Hata: " + e.getMesagge());
                }
            }
        }
    }
}
