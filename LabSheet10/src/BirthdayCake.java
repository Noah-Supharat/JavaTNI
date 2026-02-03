public class BirthdayCake extends Bakery{
    private String message;
    private double pound;

    public BirthdayCake(String message, double pound, String flavor, double unitPrice){
        super(flavor, unitPrice);
        this.message = message;
        this.pound = pound;
    }

    public String getMessage(){
        return this.message;
    }

    public void changeMessage(String new_message){
        this.message = new_message;
    }

    public int getPackingCost(){
        return (pound >= 3 ? 10 : super.getPackingCost());
    }

    public double calculateTotalPrice(){
        return (getUnitPrice() * pound )+ getPackingCost();
    }

    public String toString(){
        return super.toString() + "\n" + getFlavor() + " birthday cake (message = " + this.message + ")" +
                "\nTotal price of Birthday cake = " + calculateTotalPrice();
    }
}
