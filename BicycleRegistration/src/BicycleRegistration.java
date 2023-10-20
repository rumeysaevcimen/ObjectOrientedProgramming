public class BicycleRegistration {
    public static void main(String[] args) {
        Bicycle bisiklet1, bisiklet2;
        String sahip1, sahip2;
        bisiklet1 = new Bicycle( ); //Create and assign values to bike1
        bisiklet1.setSahibininAdi("Rumeysa Evcimen");
        bisiklet2 = new Bicycle( ); //Create and assign values to bike2
        bisiklet2.setSahibininAdi("Busra Evcimen");
//Output the information
        sahip1 = bisiklet1.getSahibininAdi( );
        sahip2 = bisiklet2.getSahibininAdi( );
        System.out.println(sahip1 + " bir bisikleti var.");
        System.out.println(sahip2 + " ayrıca bir bisikleti var.");
    }
}
