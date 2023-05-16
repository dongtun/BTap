package BTVN.BT7;

public class CardFactory {
    private CardFactory(){};
    public static Card getCard(String card){
        switch (card){
            case "MoneyBank":
                return new MoneyBank();
            case "Platium":
                return new Platinum();
            case "Titanium":
                return new Titanium();
            default:
                return null;
        }
    }
}
