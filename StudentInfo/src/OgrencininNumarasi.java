public class OgrencininNumarasi {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci("Rumeysa", "Evcimen", 125468);

        System.out.println("Öğrenci adı: " + ogrenci.getAd());
        System.out.println("Öğrenci soyadı: " + ogrenci.getSoyad());
        System.out.println("Öğrenci numarası: " + ogrenci.getNumara());
        System.out.println("Tarih" + ogrenci.getTarih());



    }
}
