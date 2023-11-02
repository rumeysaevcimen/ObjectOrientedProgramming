public class TV {

    private int kanal;
    private int sesSeviyesi;
    private boolean acKapa;

    public TV(){
        kanal = 1;
        sesSeviyesi = 1;
        acKapa = false;
    }

    public void tvAc(){
        acKapa = true;
    }

    public void tvKapa(){
        acKapa = false;
    }

    public void setKanal(int yeniKanal){
        kanal = yeniKanal;
    }
    public void setSesSeviyesi(int yeniSes){
        sesSeviyesi = yeniSes;
    }

    public void kanalArttir(){
        kanal = kanal + 1;
    }
    public void kanalAzalt(){
        kanal = kanal - 1;
    }
    public void sesArttir(){
        sesSeviyesi = 1;
    }
    public void sesAzalt(){
        sesSeviyesi = sesSeviyesi + 1;
    }
    public int getKanal(){
        return kanal;
    }
    public int getSesSeviyesi(){
        return sesSeviyesi;
    }
}
