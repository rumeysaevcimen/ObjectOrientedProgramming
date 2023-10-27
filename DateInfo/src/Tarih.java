import java.util.*;

public class Tarih {

    private int ay;
    private int gun;
    private int yil;

    public void ciktiDuzeni()
    {
        System.out.println(gun + " /" + ay + " / " + yil);
    }

    public void girdiler()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Günü giriniz: ");
        gun = scanner.nextInt();

        System.out.println("Ayı giriniz: ");
        ay = scanner.nextInt();

        System.out.println("Yılı giriniz: ");
        yil = scanner.nextInt();
    }

    public int getGun(){
        return gun;
    }

    public String getAy(){
        if(ay == 1)
            return "Ocak";
        else if(ay == 2)
            return "Subat";
        else if(ay == 3)
            return "Mart";
        else {
            System.out.println("Hatalı giriş!");
            System.exit(0);
            return "Geçersiz";
        }

    }

    public int getYil(){
        return yil;
    }
}
