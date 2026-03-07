public class Payment {
    private double amountPaid;
    private double change;

    public Payment(double amountPaid){
        this.amountPaid = amountPaid;
    }

    public void calculateChange(double totalPrice){
        change = totalPrice - amountPaid;
    }

    public double getChange() {
        return change;
    }
}
