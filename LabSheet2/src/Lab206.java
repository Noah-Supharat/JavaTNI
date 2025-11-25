import javax.swing.JOptionPane;
import java.text.*;

public class Lab206 {
    public static void main(String[] args) {
        final double buffetPrice = 299;
        DecimalFormat df = new DecimalFormat("#,###.00");

        int customerAmount = Integer.parseInt(JOptionPane.showInputDialog(null,
                "How many customer?", "Input", JOptionPane.QUESTION_MESSAGE));
        double netPrice = buffetPrice * (double)customerAmount * 107 / 100;
        int discount = Integer.parseInt(JOptionPane.showInputDialog(null,
                ("Price with NET is " + df.format(netPrice) + " baht."
                + "\nHow much of discount(%) on your coupon?"), "Input", JOptionPane.QUESTION_MESSAGE));
        double totalPrice = netPrice * (100 - discount) / 100;
        int amountThatCustomerPaid = Integer.parseInt(JOptionPane.showInputDialog(null,
                ("Total price is " + df.format(totalPrice) + " baht."
                + "\nenter the amount the customer paid:"), "Input", JOptionPane.QUESTION_MESSAGE));
        double change = amountThatCustomerPaid - totalPrice;
        JOptionPane.showMessageDialog(null, ("Total price is " + df.format(totalPrice) + " baht."
        + "\nCustomer paid " + df.format(amountThatCustomerPaid) + " baht."
        + "\nGet change " + df.format(change) + " baht."));
    }
}
