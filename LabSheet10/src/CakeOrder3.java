import javax.swing.*;

public class CakeOrder3 extends Bakery{
    static void main() {
        double pound = Double.parseDouble(JOptionPane.showInputDialog("How many pound do you want?"));
        String flavor = JOptionPane.showInputDialog("Enter a flavor birthday cake:");
        String message = JOptionPane.showInputDialog("Enter a message on cake:");

        BirthdayCake birthdayCake = new BirthdayCake(message, pound, flavor, 400);

        int orderConfirm;
        while(true){
            orderConfirm = JOptionPane.showConfirmDialog(null, birthdayCake.toString() +
                    "\n\nConfirm this order?", "Select an option", JOptionPane.YES_NO_CANCEL_OPTION);
            if(orderConfirm == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, birthdayCake.toString());
                break;
            }
            else if(orderConfirm == JOptionPane.NO_OPTION || orderConfirm == JOptionPane.CANCEL_OPTION){
                //message = JOptionPane.showInputDialog("Enter a new message for changing:");
                birthdayCake.changeMessage(JOptionPane.showInputDialog("Enter a new message for changing:"));
            }
        }
    }
}
