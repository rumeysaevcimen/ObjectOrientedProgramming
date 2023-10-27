public class Elementler {

    private String elementAdi;
    private int elementAtomSayisi;
    private String elementSembolu;
    private double elementKutlesi;
    private int elementPeriyotDegeri;
    private int elementGrubu;

    public Elementler(String ad, int atom, String sembol, double kutle, int periyot, int grup){
        elementAdi = ad;
        elementAtomSayisi = atom;
        elementSembolu = sembol;
        elementKutlesi = kutle;
        elementPeriyotDegeri = periyot;
        elementGrubu = grup;
    }

    public void elementYazdir(){
        System.out.println("Element adı: " + elementAdi);
        System.out.println("Element atom sayısı: " + elementAtomSayisi);
        System.out.println("Element sembolü: " + elementSembolu );
        System.out.println("Element kütlesi: " + elementKutlesi );
        System.out.println("Element periyot değeri: " + elementPeriyotDegeri );
        System.out.println("Element grup değeri: " + elementGrubu);
    }

    public String getElementAdi(){
        return elementAdi;
    }

    public int getElementAtomSayisi(){
        return elementAtomSayisi;
    }

    public String getElementSembolu(){
        return elementSembolu;
    }

    public double getElementKutlesi(){
        return elementKutlesi;
    }

    public int getElementPeriyotDegeri(){
        return  elementPeriyotDegeri;
    }

    public int getElementGrubu(){
        return elementGrubu;
    }

}
