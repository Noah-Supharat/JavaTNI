public class Croissant extends Bakery{
    private int piece;
    private boolean isFilling;
    private String fillingFlavor;
    private boolean isTopping;
    private String toppingFlavor;
    private boolean isFruit;
    private String fruitType;
    private boolean individualPack;

    public Croissant(int piece, boolean isFilling, String fillingFlavor, boolean isTopping, String toppingFlavor, boolean isFruit, String fruitType, boolean individualPack, String flavor, double unitPrice){
        super(flavor, unitPrice);
        this.piece = piece;
        this.isFilling = isFilling;
        this.fillingFlavor = fillingFlavor;
        this.isTopping = isTopping;
        this.toppingFlavor = toppingFlavor;
        this.isFruit = isFruit;
        this.fruitType = fruitType;
        this.individualPack = individualPack;
    }

    public int getFillingPrice(){
        return (isFilling ? 10 : 0);
    }

    public int getToppingPrice(){
        return (isTopping ? 5 : 0);
    }

    public int getFruitPrice(){
        return (isFruit ? 10 : 0);
    }

    @Override
    public int getPackingCost() {
        return individualPack ? piece * 10 : (((piece / 4) * 10) + ((piece % 4) * super.getPackingCost())) ;
    }

    @Override
    public double calculateTotalPrice() {
        return piece * getUnitPrice() + getPackingCost();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCroissant(" + getFlavor() + ") " + piece + " piece" +
                (isFilling ? "\nWith " + fillingFlavor + " filling" : "") +
                (isTopping ? "\nWith " + toppingFlavor + " topping" : "") +
                (isFruit ? "\nWith " + fruitType : "") +
                "\nTotal price of Croissant = " + calculateTotalPrice();
    }
}
