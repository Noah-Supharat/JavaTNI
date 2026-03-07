import java.util.ArrayList;
import java.util.List;

public class OrderSystem {
    private List<Product> products;
    private Order currentOrder;
    //private SaleReport saleReport; //รอเจ๋ง

    public OrderSystem() {
        products = new ArrayList<>();
        //saleReport = new SalesReport(); //รอเจ๋ง
    }

    public void createOrder(String orderId) {
        //currentOrder = new Order(orderId);
    }

    public void addProductToOrder(Product product, int quantity) {
        if (currentOrder != null) {
            currentOrder.addItem(product, quantity);
            product.updateStock(quantity);
        }
    }

    public Payment checkout(double amountPaid) {
        double total = currentOrder.calculateTotal();

        Payment payment = new Payment(amountPaid);
        payment.calculateChange(total);
        //saleReport.addOrder(currentOrder); //รอเจ๋ง

        return payment;
    }
}
