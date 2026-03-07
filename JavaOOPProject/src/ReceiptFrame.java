import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ReceiptFrame extends JFrame {

    private JPanel ReceiptPage;
    private JLabel Total;
    private JLabel Payment;
    private JLabel Change;
    private JButton CONFIRMButton;
    private JTextArea Receipt;


    public ReceiptFrame(Order order, Member currentMember, double totalAfterDiscount, double payment, double change){
        setTitle("Receipt Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900,600);
        setContentPane(ReceiptPage);
        setLocationRelativeTo(null);

        Receipt.setText("");

        var items = order.getItems();

        if(items != null) {
            for (OrderItem item : order.getItems()) {

                String name = item.getProduct().getName();
                int qty = item.getQuantity();
                double price = item.getProduct().getPrice();

                Receipt.append(name + " x " + qty + " = " + (qty * price) + "\n");
            }
        }

        ReceiptPage.setBorder(new EmptyBorder(5, 10, 5, 10));

        CONFIRMButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        CONFIRMButton.setFocusPainted(false);

        CONFIRMButton.addActionListener(e -> {
            this.dispose();
        });

        Total.setText("Total: " + totalAfterDiscount);
        Payment.setText("Payment: " + payment);
        Change.setText("Change: " + change);

        System.out.println(order.getItems());
        System.out.println(order.getItems().size());
    }
}