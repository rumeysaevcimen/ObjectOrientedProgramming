public class Balloon {
    private double radius;

    public Balloon() {
        radius = 0;
    }

    public void inflate(double amount) {
        if (amount > 0) {
            radius += amount;
        } else {
            System.out.println("Geçersiz miktar! Pozitif bir değer girin.");
        }
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static void main(String[] args) {
        Balloon balloon = new Balloon();
        balloon.inflate(2.5);
        System.out.println("Balonun Hacmi: " + balloon.getVolume() + " birim küp");
    }
}