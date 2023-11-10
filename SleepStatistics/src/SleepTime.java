import java.text.DecimalFormat;
import java.util.Scanner;

public class SleepTime {
    private Scanner scanner;
    public static void main(String[] args) {
        SleepTime time = new SleepTime();
        time.start();
    }
    public SleepTime(){
        scanner = new Scanner(System.in);
    }
    public void start(){
        double sleepTime, toplam = 0;
        int sayac = 0;
        System.out.println("Yurt adını giriniz: ");
        String yurt = scanner.next();

        sleepTime = getSleepTime("Kaç saat uyuduğunuzu giriniz: ");
        while (sleepTime != -1){
            toplam += sleepTime;
            sayac++;
            sleepTime = getSleepTime("Kaç saat uyuduğunuzu giriniz: ");
        }
        if(sayac == 0){
            System.out.println("Veri girilmedi!!!");
        }
        else {
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(yurt + "'da ortalama uyuma süresi \n\n" +
                    df.format(toplam/sayac) + "saattir.");
        }
    }
    public double getSleepTime(String message){
        System.out.println(message);
        return scanner.nextDouble();
    }
}
