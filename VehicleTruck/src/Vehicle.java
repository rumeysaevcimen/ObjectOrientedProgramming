import java.util.Objects;

public class Vehicle {

    private double yuklemeKapasitesi;
    private String ureticiFirma;
    private int silindir;
    private Person owner;

    public Vehicle(String toyota, int i, Person owner1) {
        this.ureticiFirma = "";
        this.silindir = 0;
        this.owner = null;
    }

    public Vehicle(String ureticiFirma, int silindir, Person owner, double yuklemeKapasitesi) {
        this.ureticiFirma = ureticiFirma;
        this.silindir = silindir;
        this.owner = owner;
        this.yuklemeKapasitesi = yuklemeKapasitesi;
    }

    public String getUreticiFirma() {
        return this.ureticiFirma;
    }

    public void setUreticiFirma(String ureticiFirma) {
        this.ureticiFirma = ureticiFirma;
    }

    public int getSilindir() {
        return this.silindir;
    }

    public void setSilindir(int silindir) {
        this.silindir = silindir;
    }

    public Person getOwner() {
        return this.owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }


    public String toString() {
        return "Vehicle{" +
                "Üretici firma='" + ureticiFirma + '\'' +
                ", Silindir=" + silindir +
                ", owner=" + owner +
                '}';
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Vehicle vehicle = (Vehicle) other;
        return Objects.equals(ureticiFirma, vehicle.ureticiFirma) &&
                silindir == vehicle.silindir &&
                Objects.equals(owner, vehicle.owner);
    }

}

