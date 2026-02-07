public class CupCake extends Bakery{
    private int piece;

    public CupCake (int piece, String flavor, double unitPrice){
        super(flavor, unitPrice);
        this.piece = piece;
    }

    public boolean isPackingBox(){
        return piece >= 6;
    }

    public int getBoxNumber(){
        return piece / 6;
    }

    public int getBagNumber(){
        return piece % 6;
    }

    @Override
    public int getPackingCost() {
        return getBoxNumber() * super.getPackingCost();
    }

    @Override
    public double calculateTotalPrice() {
        return (getUnitPrice() * piece) + getPackingCost() + (getBagNumber() * 0.5);
    }

    public String toString(){
        return super.toString() +
                "\nCup cake("+ getFlavor() + ") with " + (isPackingBox() ? getBoxNumber() + " Box " : "") + getBagNumber() + " Bag" +
                "\nTotal price of Cup cake = " + calculateTotalPrice();
    }
}
