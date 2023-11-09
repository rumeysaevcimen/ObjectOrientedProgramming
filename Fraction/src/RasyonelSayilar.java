public class RasyonelSayilar {

    private int pay;
    private int payda;

    public int getPay(){
        return pay;
    }

    public int getPayda(){
        return payda;
    }

    public void setPay(int p1){
        pay = p1;
    }

    public void setPayda(int p2){
        payda = p2;
    }

    public boolean esitMi(RasyonelSayilar r1){
        if(pay == r1.getPay() && payda == r1.getPayda())
            return true;
        else
            return false;
    }
}
