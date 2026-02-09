public class Espresso extends Drink{
    private int shot;

    public Espresso(String size){
        super("Espresso", 35, size);
        this.shot = 0;
    }

    public void addShot(int shot){
        this.shot += shot;
    }

    public int getShot() {
        return shot;
    }

    public double calculateFinalPrice(){
        return getBasePrice() + (15 * getShot()) + getSizeExtra();
    }

    @Override
    public String toString() {
        return super.toString() +
                (getShot() > 0 ? "\nAdded " + getShot() + " shot\n" : "\n") +
                "Total price = " + calculateFinalPrice() + " Baht";
    }
}
