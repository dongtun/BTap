package BTVN.BT7;

public class MoneyBank implements Card {
    public String getCardType() {
        return "MoneyBack";
    }

    @Override
    public int getCreditLimit() {
        return 50000;
    }

    @Override
    public int getAnnualCharge() {
        return 0;
    }
}
