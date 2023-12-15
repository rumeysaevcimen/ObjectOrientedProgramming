import java.util.Scanner;

public class Deneme01 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        double[] dizim01 = new double[20];
        double toplam = 0.0;

        System.out.println(dizim01.length + " adet değer giriniz: ");
        for (int i = 0; i < dizim01.length; i++) {
            dizim01[i] = Math.random()*100;
            toplam += dizim01[i];
            System.out.format("%5.2f  ", dizim01[i]);
        }

        for(int i = 0; i < dizim01.length; i++){
            int rastgele = (int)Math.random()*20;
            double gecici = dizim01[i];
            dizim01[i] = dizim01[rastgele];
            dizim01[rastgele] = gecici;
            System.out.println(dizim01[i]);
        }
        for(int i = 0; i < dizim01.length; i++)
            System.out.println(dizim01[i]);

        double max = dizim01[0];
        for (int i = 0; i < dizim01.length; i ++){
            if(max < dizim01[i])
                max = dizim01[i];
        }

        int sayilar[] = {1, 5, 3, 4, 5, 5};
        int enBuyukSayi = sayilar[0];
        for(int i = 1; i < sayilar.length; i++){
            if(enBuyukSayi <= sayilar[i])
                enBuyukSayi = sayilar[i];
        }
        for (int i = 0; i < sayilar.length; i++)
            if(enBuyukSayi == sayilar[i]) {
                System.out.println("\nDamga " + i);
                break;
            }

        System.out.println("\n En büyük: " + max);
        System.out.println("\n Toplam: " + toplam);


    }
}
