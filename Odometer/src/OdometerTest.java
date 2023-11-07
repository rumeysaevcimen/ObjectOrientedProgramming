class Odometer {
    private double toplamMesafe;
    private double yakitVerimliligi;

    public Odometer() {
        yakitVerimliligi = 0.05;
    }

    public void setMesafeLimit(double limit) {
        toplamMesafe = Math.min(toplamMesafe, limit);
    }

    public void setYakitVerimliligi(double yakitVerimliligi) {
        yakitVerimliligi = yakitVerimliligi;
    }

    public void mesafeEkle(double mesafe) {
        toplamMesafe = toplamMesafe + mesafe;
    }

    public double getTuketilenYakitVerimliligi() {
        return toplamMesafe * yakitVerimliligi;
    }
}

public class OdometerTest {
    public static void main(String[] args) {
        Odometer carOdometer = new Odometer();
        carOdometer.mesafeEkle(100);
        carOdometer.mesafeEkle(50);
        carOdometer.setMesafeLimit(120);
        carOdometer.setYakitVerimliligi(0.06);
        double tuketilenYakit = carOdometer.getTuketilenYakitVerimliligi();
        System.out.println("Tüketilen yakıt miktarı: " + tuketilenYakit + " litre");
    }
}