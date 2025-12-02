import javax.swing.*;
import java.text.DecimalFormat;

public class Ex301 {
    public static void main(String[] args) {
        double totalPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter total price:"));

        DecimalFormat df = new DecimalFormat("#,###.00");

        int coupon = JOptionPane.showConfirmDialog(null,"Do you have coupon?");

        if(coupon == 0){
            int discount = Integer.parseInt(JOptionPane.showInputDialog("How many discount(%) on the coupon?"));
            double discountPrice = totalPrice * discount / 100;
            double priceAfterDiscount = totalPrice - discountPrice;
            JOptionPane.showMessageDialog(null,"You get discount " + df.format(discountPrice) + " baht."
            + "\nTotal price is " + df.format(priceAfterDiscount) + " baht.");
        }
        else{
            if(totalPrice > 1500){
                double discountPrice = totalPrice * 10 / 100;
                double priceAfterDiscount = totalPrice - discountPrice;
                JOptionPane.showMessageDialog(null,"You get discount 10% (" + df.format(discountPrice) + ")"
                        + "\nTotal price is " + df.format(priceAfterDiscount) + " baht.");
            }
            else{
                JOptionPane.showMessageDialog(null,"Total price is " + df.format(totalPrice) + " baht.");
            }
        }
    }
}