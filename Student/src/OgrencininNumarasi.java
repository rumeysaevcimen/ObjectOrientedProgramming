public class OgrencininNumarasi {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.setAd("Rumeysa");
        ogrenci.setSoyad("Evcimen");
        ogrenci.setNumara(215463);

        System.out.println("Öğrenci adı: " + ogrenci.getAd());
        System.out.println("Öğrenci soyadı: " + ogrenci.getSoyad());
        System.out.println("Öğrenci numarası: " + ogrenci.getNumara());



    }
}
