import javax.swing.JOptionPane;

public class Nsb6 {
    public static void main(String[] args) {

        String yillik_faiz_oraniString = JOptionPane.showInputDialog("Yıllık faiz oranını giriniz: ");

        double yillik_faiz_orani = Double.parseDouble(yillik_faiz_oraniString);

        double aylik_faiz_orani = yillik_faiz_orani / 1200;

        String numberOfYearsString = JOptionPane.showInputDialog("enter number of years as an intger: ");

        int numberOfYears = Integer.parseInt(numberOfYearsString);

        String loanString = JOptionPane.showInputDialog("Kredi miktarını giriniz: ");

        double kredi_miktari = Double.parseDouble(loanString);

        double aylik_odeme = kredi_miktari * aylik_faiz_orani / (1 - 1 / Math.pow(1 + aylik_faiz_orani, numberOfYears * 12));
        double toplam_odeme = aylik_odeme * numberOfYears * 12;

        aylik_odeme = (int)(aylik_odeme * 100) / 100.0;
        toplam_odeme = (int)(toplam_odeme * 100) / 100.0;

        String output = "Aylık ödeme: " + aylik_odeme + "\nToplam ödeme" + toplam_odeme;
        JOptionPane.showMessageDialog(null, output);
    }
}
