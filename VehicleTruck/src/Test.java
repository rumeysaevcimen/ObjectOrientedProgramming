public class Test {

    public static void main(String[] args) {

        // Create owner
        Person owner = new Person("Rümeysa Evcimen");

        // Create vehicles
        Vehicle vehicle1 = new Vehicle("Toyota", 4, owner, 1000.0);
        Truck truck1 = new Truck("Ford", 6, owner, 5000.0);

        // Test getters and setters
        System.out.println("Araç 1:");
        System.out.println("Üretici Firma: " + vehicle1.getUreticiFirma());
        System.out.println("Silindirler: " + vehicle1.getSilindir());
        System.out.println("Sahip: " + vehicle1.getOwner().getName());

        vehicle1.setUreticiFirma("Honda");
        System.out.println("Üretici Firma (after settings): " + vehicle1.getUreticiFirma());

        // Test Truck specific methods
        System.out.println("Kamyon 1:");
        System.out.println("Yükleme Kapasitesi: " + truck1.getYuklemeKapasitesi());

        truck1.setYuklemeKapasitesi(8000.0);
        System.out.println("Yükleme Kapasitesi (after setting): " + truck1.getYuklemeKapasitesi());

        // Test equals method
        System.out.println("Araç 1, Araç 1'e eşittir: " + vehicle1.equals(vehicle1));
        System.out.println("Araç 1, Kamyon 1'e eşittir: " + vehicle1.equals(truck1));

        // Test toString method
        System.out.println("Araç 1: " + vehicle1.toString());
        System.out.println("Kamyon 1: " + truck1.toString());
    }
}
