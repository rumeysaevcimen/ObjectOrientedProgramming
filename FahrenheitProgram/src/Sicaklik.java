public class Sicaklik {
    private double temperatureFahrenheit;

    public Sicaklik(double sicaklik) {

        temperatureFahrenheit = sicaklik;
    }

    public double getFahrenheit() {

        return temperatureFahrenheit;
    }

    public double getCelsius() {

        return (temperatureFahrenheit - 32) * 5 / 9;
    }

    public void setFahrenheit(double sicaklik) {

        temperatureFahrenheit = sicaklik;
    }

    public void setCelsius(double sicaklik) {

        temperatureFahrenheit = (sicaklik * 1.8) + 32;
    }

}
