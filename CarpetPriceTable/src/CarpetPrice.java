public class CarpetPrice {
    public static void main(String[] args) {
        System.out.print("  ");
        for(int i = 5; i<= 25; i += 5)
            System.out.printf("%8d", i);
        for(int en = 5; en <= 14; en += 1) {
            System.out.println();
            System.out.printf("%2d", en);
            for (int boy = 5; boy <= 25; boy += 5)
                System.out.printf("%8d", en * boy * 15);
        }
    }
}
