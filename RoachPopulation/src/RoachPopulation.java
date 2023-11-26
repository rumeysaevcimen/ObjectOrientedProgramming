public class RoachPopulation {

    private int roaches;

    public RoachPopulation(int roaches) {
        this.roaches = roaches;
    }

    public void breed() {
        roaches *= 2;
    }

    public void spray(double percentage) {
        roaches -= (int) (roaches * percentage / 100);
    }

    public int getRoaches() {
        return roaches;
    }
}
