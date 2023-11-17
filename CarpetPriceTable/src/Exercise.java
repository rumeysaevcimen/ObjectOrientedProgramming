public class Exercise {
    public static void main(String[] args) {
        String a = "LENGTH";
        System.out.printf("%25s", a);
        System.out.println();
        for(int i = 5; i <=25; i += 5)
            System.out.printf("%8d", i);
        for(int en = 11; en <= 20; en += 1) {
            System.out.println();
            System.out.printf("%2d", en);
            for (int boy = 5; boy <= 25; boy += 5)
                System.out.printf("%8d", en * boy * 19);
        }
    }
}
//WIDTH eklemesi yapılacak sol tarafa.