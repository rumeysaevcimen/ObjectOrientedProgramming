import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        double baslangicYuksekligi, konum, yereCarpmaAni;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yüksekliği giriniz: " );
        baslangicYuksekligi = scanner.nextDouble();

        yereCarpmaAni = Math.sqrt(baslangicYuksekligi / 16.0);
        yereCarpmaAni = Math.round(yereCarpmaAni * 10000.0) / 10000.0;
        System.out.println("Başlangıç yüksekliği: " + baslangicYuksekligi);
        System.out.print("t zamanı" );
        System.out.println("              " + "t anında konum ");

        for(int t = 0; t < yereCarpmaAni; t++){
            konum = -16 * t * t + baslangicYuksekligi;
            System.out.print(t);
            System.out.println("                       " + konum);
        }
        System.out.println("Yere çarpma anı: " + yereCarpmaAni);
    }
}
