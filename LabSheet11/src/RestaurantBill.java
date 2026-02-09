import javax.swing.*;

public class RestaurantBill {
    static void main() {
        String name = JOptionPane.showInputDialog("Enter customer's name:");
        int customerBill = Integer.parseInt(JOptionPane.showInputDialog("Enter customer's bill:"));
        int member = JOptionPane.showConfirmDialog(null, "Do you have a member card?", "Member", JOptionPane.YES_NO_OPTION);

        if(member == JOptionPane.YES_OPTION){
            String memberLevel = JOptionPane.showInputDialog("Enter a member level [Gold/Premium];");
            Customer c1 = new Member(name, customerBill, memberLevel);
            JOptionPane.showMessageDialog(null,c1.toString());
        } else{
            Customer c2 = new Regular(name, customerBill);
            JOptionPane.showMessageDialog(null,c2.toString());
        }
    }
}
