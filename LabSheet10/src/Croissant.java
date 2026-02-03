public class Croissant extends Bakery{
    private int piece;
    private boolean is_filled;
    private boolean is_topping;

    public Croissant(int piece, boolean is_filled, boolean is_topping, String flavor, double unitPrice){
        super(flavor, unitPrice);
        this.piece = piece;
        this.is_filled = is_filled;
        this.is_topping = is_topping;
    }

    public int getPackingCost(){
        if((is_topping && is_filled) && (piece >= 6)){
            return 20;
        } else if ((is_topping && is_filled)) {
            return 10;
        } else{
            return super.getPackingCost();
        }
    }

    public int toppingAndFilling(){
        return ((is_topping ? 20 : 0) + (is_filled ? 10 : 0));
    }

    public double calculateTotalPrice(){
        //return ((getUnitPrice() + toppingAndFilling()) * piece) + getPackingCost();
        return piece * (getUnitPrice() + toppingAndFilling()) + getPackingCost();
    }

    public String toString(){
        return super.toString() + "\n" + "Croissant(" + getFlavor() + ")" +
                "\nTopping: " + (is_topping ? "Yes" : "No") +
                "\nFilling: " + (is_filled ? "Yes" : "No") +
                "\nTotal price of Croissant = " + this.calculateTotalPrice();
    }

}
