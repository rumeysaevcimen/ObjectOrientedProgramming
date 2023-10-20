//final kelimesi sabitlerden önce kullanılır. final double PI = 3.14..//
//kontrol karakterleri \t ve \n    //

import java.text.DecimalFormat;

public class cember {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");

        final double PI = 3.14159;
        double yaricap, alan, cevre;
        yaricap = 2.35;
        alan   = PI * yaricap * yaricap;
        cevre = 2.0 * PI * yaricap;

        System.out.println("Verilen yaricap: " + "\t" + yaricap + "\n" +
                           "Alan: " + "\t\t\t\t" + alan + "\n" +
                           "Cevre: " + "\t\t\t\t" + cevre);


    }
}
