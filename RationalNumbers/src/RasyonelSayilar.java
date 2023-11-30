public class RasyonelSayilar {
        private int pay;
        private int payda;

        public RasyonelSayilar(int p1, int p2){
            setPay(p1);
            setPayda(p2);
        }
    public void setPay(int p1){
        pay = p1;
    }
    public void setPayda(int p2){
            if (p2 == 0){
                System.out.println("Hata!");
                System.exit(1);
            }
            payda = p2;
    }

    public int getPay(){
            return pay;
    }
    public int getPayda(){
            return payda;
    }

    public String toString(){
            return getPay() + "/" + getPayda();
    }
    public RasyonelSayilar sadelestir(){
            int p1 = getPay();
            int p2 = getPayda();
            int ebob = ebob1(p1, p2);
            RasyonelSayilar sadelestirilmis = new RasyonelSayilar(p1/ebob, p2/ebob);
            return sadelestirilmis;
        }

    public RasyonelSayilar topla (RasyonelSayilar r2){
        int a, b, c, d;
        RasyonelSayilar toplam;
        a = this.getPay();
        b = this.getPayda();
        d = r2.getPayda();
        c = r2.getPay();
        toplam = new RasyonelSayilar(a*d + b*c, b*d);
        return toplam;
    }

        private int ebob1(int m, int n){
            int r;
            while (true){
                r = n%m;
                if (r == 0) break;
                n = m;
                m = r;}
            return m;

        }
}
