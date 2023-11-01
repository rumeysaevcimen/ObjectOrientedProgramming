import java.util.Scanner;

public class YasHesabiProgrami {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        System.out.print("Dünyadaki yaşınızı giriniz: ");
        x = scanner.nextInt();


        // verilen d degerleri type' larına gore belirtilir.

        int mercuryGunSayisi = 88;
        int venusGunSayisi = 225;
        double jupiterGunSayisi = 4.380;
        double saturnGunSayisi = 10.767;

        // y degeri burada gezegen adlarına göre tanimlanmistir.
        // y = (x * 365) / d formulu her bir gezegen icin yazilmistir.

        double mercuryYasi = (x * 365) / mercuryGunSayisi;
        double venusYasi = (x * 365) / venusGunSayisi;
        double jupiterYasi = (x * 365) / jupiterGunSayisi;
        double saturnYasi = (x * 365) / saturnGunSayisi;

        // her bir gezegen için ayrı sonuclar doner.

        System.out.println("Mercury yaşınız: " + mercuryYasi);
        System.out.println("Venus yaşınız: " + venusYasi);
        System.out.println("Jupiter yaşınız: " + jupiterYasi);
        System.out.println("Saturn yaşınız: " + saturnYasi);


    }

}


