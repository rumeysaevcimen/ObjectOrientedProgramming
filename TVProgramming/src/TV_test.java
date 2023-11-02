public class TV_test {
    public static void main(String[] args) {
        TV tv01 = new TV();

        tv01.tvAc();

        System.out.println("Kanal: " + tv01.getKanal() + " Ses seviyesi: " + tv01.getSesSeviyesi());

        tv01.kanalArttir();
        tv01.kanalAzalt();
        tv01.setSesSeviyesi(7);

        System.out.println("Kanal: " + tv01.getKanal() + " Ses seviyesi: " + tv01.getSesSeviyesi());

        tv01.tvKapa();

        System.out.println("Kanal: " + tv01.getKanal() + " Ses seviyesi: " + tv01.getSesSeviyesi());
    }
}
