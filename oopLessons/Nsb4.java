import java.text.DecimalFormat;

public class Nsb4 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");

        final String TAB = "\t";
        final String NEWLINE = "\n";
        final double PI = 3.14159;

        double yaricap, alan, cevre;
        yaricap = 2.35;
        alan   = PI * yaricap * yaricap;
        cevre = 2.0 * PI * yaricap;

        System.out.println(
                "Verilen yaricap: " + TAB + yaricap + NEWLINE +
                "Alan: " + TAB + alan + NEWLINE +
                "Cevre: " + TAB + cevre);


    }
}
