package BTVN.BT7;

public class Platinum implements Card {
    public String getCardType() {
        return "Platinum";
    }


    public int getCreditLimit() {
        return 100000;
    }


    public int getAnnualCharge() {
        return 500;
    }
}
