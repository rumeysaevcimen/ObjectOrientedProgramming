import java.util.Objects;

public class Truck {

    private String ureticiFirma;
    private int silindir;
    private Person owner;
    private double yuklemeKapasitesi;

    public Truck() {
        this.ureticiFirma = "";
        this.silindir = 0;
        this.owner = null;
        this.yuklemeKapasitesi = 0;
    }

    public Truck(String ureticiFirma, int silindir, Person owner, double yuklemeKapasitesi) {
        this.ureticiFirma = ureticiFirma;
        this.silindir = silindir;
        this.owner = owner;
        this.yuklemeKapasitesi = yuklemeKapasitesi;
    }

    public String getUreticiFirma() {
        return ureticiFirma;
    }

    public void setUreticiFirma(String ureticiFirma) {
        this.ureticiFirma = ureticiFirma;
    }

    public int getSilindir() {
        return silindir;
    }

    public void setSilindir(int silindir) {
        this.silindir = silindir;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public double getYuklemeKapasitesi() {
        return yuklemeKapasitesi;
    }

    public void setYuklemeKapasitesi(double yuklemeKapasitesi) {
        this.yuklemeKapasitesi = yuklemeKapasitesi;
    }

    public String toString() {
        return "Truck{" +
                "Üretici Firma='" + ureticiFirma + '\'' +
                ", silindir=" + silindir +
                ", owner=" + owner +
                ", yuklemeKapasitesi=" + yuklemeKapasitesi +
                '}';
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Truck truck = (Truck) other;
        return Objects.equals(ureticiFirma, truck.ureticiFirma) &&
                silindir == truck.silindir &&
                Objects.equals(owner, truck.owner) &&
                Objects.equals(yuklemeKapasitesi, truck.yuklemeKapasitesi);
    }
}
