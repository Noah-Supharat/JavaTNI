package Customer;

abstract class Customer{
    private String name;
    private double billAmount;

    public Customer(String name, double billAmount){
        this.name = name;
        this.billAmount = billAmount;
    }

    public double getBillAmount() {
        return billAmount;
    }

    abstract double calculateFinalBill();

    @Override
    public String toString() {
        return "Customer: " + name +
                "\nBill amount: " + billAmount;
    }
}
