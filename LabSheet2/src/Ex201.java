import java.text.*;

public class Ex201 {
    public static void main(String[] args) {
        String productId = "PB-001";
        String productName = "Pencil Box";
        int productAmount = 112;
        double productPrice = 30.20;
        double totalPrice = productAmount * productPrice;

        DecimalFormat df = new DecimalFormat("#,###.00");

        System.out.println("Product name: " + productName + " (" + productId + ")");
        System.out.println("Product item: " + productAmount + " (" + df.format(productPrice) + " baht/piece)");
        System.out.println("Total price : " + df.format(totalPrice) + " baht");
    }
}
