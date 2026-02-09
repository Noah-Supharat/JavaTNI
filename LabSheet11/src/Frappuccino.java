public class Frappuccino extends Drink{
    private boolean whipped;

    public Frappuccino(String size, boolean whipped){
        super("Frappuccino", 40, size);
        this.whipped = whipped;
    }

    public double calculateFinalPrice(){
        return getBasePrice() + ((whipped == true) ? 15 : 0) + getSizeExtra();
    }

    @Override
    public String toString() {
        return super.toString() +
                (whipped == true ? "\nAdd whipped 15 Baht\n" : "\n") +
                "Total price = " + calculateFinalPrice() + " Baht";
    }
}
