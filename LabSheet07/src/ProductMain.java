import javax.swing.*;

public class ProductMain {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Welcome to Product Stock System");

        Product p1 = new Product();

        p1.name = JOptionPane.showInputDialog("Enter product name:");
        p1.price = Double.parseDouble(JOptionPane.showInputDialog("Enter product price per item:"));
        p1.quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter product stock:"));
        p1.showInfo();
        System.out.println();

        if(JOptionPane.showConfirmDialog(null,"Do you want to add more item?") == JOptionPane.YES_OPTION){
            p1.addStock(Integer.parseInt(JOptionPane.showInputDialog("How many product to add in stock?")));
        }

        if(JOptionPane.showConfirmDialog(null,"Do you want to change price?") == JOptionPane.YES_OPTION){
            p1.changePrice(Double.parseDouble(JOptionPane.showInputDialog("How much is the new price per item?")));
        }

        System.out.println();
        p1.showInfo();
    }
}
