public class Regular extends Customer{
    public Regular(String name, double billAmount){
        super(name, billAmount);
    }

    public boolean isDiscount(){
        return getBillAmount() >= 500;
    }

    public double calculateFinalBill(){
        return isDiscount() ? getBillAmount() * 95 / 100 : getBillAmount();
    }

    @Override
    public String toString() {
        return super.toString() +
                (isDiscount() ? "\nYou get discount 5%\n" : "\n") +
                "Total price: " + calculateFinalBill();
    }
}
