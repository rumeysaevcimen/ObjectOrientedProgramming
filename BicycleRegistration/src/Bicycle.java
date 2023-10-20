public class Bicycle {
    // Data Member
    private String sahibininAdi;
    //Constructor: Initialzes the data member
    public Bicycle( ) {
        sahibininAdi = "Bilinmiyor.";
    }
    //Returns the name of this bicycle's owner
    public String getSahibininAdi( ) {
        return sahibininAdi;
    }
    //Assigns the name of this bicycle's owner
    public void setSahibininAdi(String adi) {
        sahibininAdi = adi;
    }
}
