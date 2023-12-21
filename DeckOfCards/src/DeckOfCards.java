

public class DeckOfCards {
    public static void main(String[] args) {
        int[] kartlar = new int[52];
        String[] deste = {"Sinek", "Kupa", "Karo", "Maça"};
        String[] deger = {"As", "2", "3", "4", "5", "6", "7", "8","9", "10", "Oğlan", "Kız", "Papaz"};
        for (int i = 0; i < kartlar.length; i++)
            kartlar[i] = i;
        for (int i = 0; i < kartlar.length; i++){
            int damga = (int)(Math.random()*kartlar.length);
            int gecici = kartlar[i];
            kartlar[i] = kartlar[damga];
            kartlar[damga] = kartlar[damga];
            kartlar[damga] = gecici;
        }
        for(int i = 0; i < kartlar.length; i++)
            System.out.println(kartlar[i]);
        for (int i = 0; i < 52; i++) {
            String deste1 = deste[kartlar[i] / 13];
            String deger1 = deger[kartlar[i] % 13];
            System.out.println("Kart: " + i + ": " + deste1 + " " + deger1);

        }
    }
}
