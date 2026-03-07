public class OrderItem {
    private Product product;
    private int quantity;
    private double subTotal;
    private String temperature;
    private int sweetness;

    public OrderItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateSubTotal(){
        return subTotal = product.getPrice() * quantity;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public Product getProduct(){
        return product;
    }

    public String getName(){
        return product.getName();
    }

    public double getPrice(){
        return product.getPrice();
    }

    public String getOptionDetail() {
        return "Temperature: " + temperature + " Sweetness: " + sweetness + "%";
    }

    public int getQuantity() {
        return quantity;
    }
}
