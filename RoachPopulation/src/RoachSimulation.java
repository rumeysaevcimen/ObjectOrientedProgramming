public class RoachSimulation {

    public static void main(String[] args) {
        RoachPopulation population = new RoachPopulation(10);

        System.out.println("Roach population: " + population.getRoaches());

        population.breed();
        System.out.println("After breeding: " + population.getRoaches());

        population.spray(10);
        System.out.println("After spraying: " + population.getRoaches());

        population.breed();
        System.out.println("After breeding: " + population.getRoaches());

        population.spray(10);
        System.out.println("After spraying: " + population.getRoaches());

        population.breed();
        System.out.println("After breeding: " + population.getRoaches());

        population.spray(10);
        System.out.println("After spraying: " + population.getRoaches());
    }
}
