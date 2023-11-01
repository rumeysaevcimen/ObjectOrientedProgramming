public class FahrenheitProgram {
    public static void main(String[] args) {

        //Burada derece olarak double cinsinden bir deger tanımladik.
        // Bu deger her iki metotta da (setFahrenheit ve setCelsius) kullanilicak degerdir.

        double derece = 122.0;

        Sicaklik sicaklik = new Sicaklik(derece);

        //Burada setFahrenheit, girilen derece degerini celsius cinsinden döndürür.

        sicaklik.setFahrenheit(derece);
        System.out.println("Girilen Fahrenheit derecesi: " + sicaklik.getFahrenheit());
        System.out.println("Karşılık gelen Celsius derecesi: " + sicaklik.getCelsius());

        //Burada setCelsius. girilen derece degerini fahrenheit cinsinden döndürür.

        sicaklik.setCelsius(derece);
        System.out.println("Girilen Celsius derecesi: " + sicaklik.getCelsius());
        System.out.println("Karşılık gelen Fahrenheit derecesi: " + sicaklik.getFahrenheit());

    }
}
