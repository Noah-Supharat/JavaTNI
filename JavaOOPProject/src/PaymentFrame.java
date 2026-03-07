import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.io.IOException;
import java.util.ArrayList;

public class PaymentFrame extends JFrame {
    private ArrayList<OrderItem> orderList;
    private double total;
    Order order;
    String name = "";
    double discount = 0.0;
    double totalAfterDiscount;
    double payment;
    double change = 0.0;
    double discountable;
    int newPoint;
    int usePoint;
    int earnPoint;

    Member currentMember;

    private JPanel PaymentPage;
    private JButton SearchButton;
    private JButton MemberRegisterButton;
    private JLabel TotalPrice;
    private JLabel Discount;
    private JLabel Payment;
    private JLabel Change;
    private JButton CONFIRMButton;
    private JTextField PhoneNumberTextField;
    private JLabel TotalAfterDiscount;
    private JTextField CustomerPayTextField;
    private JButton PhoneNumberClearButton;
    private JTextField PointToUseTextField;
    private JButton PointUseClearButton;
    private JButton CONFIRMUSEPOINTButton;
    private JButton CustomerClearButton;
    private JLabel MemberName;
    private JLabel MemberPhoneNumber;
    private JLabel PointAmount;
    private JLabel Discountable;
    private JButton CONFIRMPAYMENTButton;

    public PaymentFrame(Order order, double total){
        this.order = order;
        this.total = total;
        this.totalAfterDiscount = total;
        this.newPoint = 0;
        this.usePoint = 0;
        this.earnPoint = 0;

        PaymentPage.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        Member member = new Member("", "000000", name, 0);
        name = member.getUsername();


        setTitle("Payment Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900,600);
        setContentPane(PaymentPage);
        setLocationRelativeTo(null);
        setVisible(true);

        CustomerPayTextField.setBorder(new EmptyBorder(5, 10, 5, 10));
        PointToUseTextField.setBorder(new EmptyBorder(5, 10, 5, 10));
        PhoneNumberTextField.setBorder(new EmptyBorder(5, 10, 5, 10));

        PhoneNumberClearButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        PhoneNumberClearButton.setFocusPainted(false);
        CONFIRMPAYMENTButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        CONFIRMPAYMENTButton.setFocusPainted(false);
        CONFIRMUSEPOINTButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        CONFIRMUSEPOINTButton.setFocusPainted(false);
        PointUseClearButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        PointUseClearButton.setFocusPainted(false);
        SearchButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        SearchButton.setFocusPainted(false);
        MemberRegisterButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        MemberRegisterButton.setFocusPainted(false);
        CONFIRMButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        CONFIRMButton.setFocusPainted(false);
        CustomerClearButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        CustomerClearButton.setFocusPainted(false);

        MemberRegisterButton.addActionListener(e -> {
            MembershipFrame membershipFrame = new MembershipFrame(order, total);
            membershipFrame.setVisible(true);
            this.dispose();
        });

        CONFIRMButton.addActionListener(e -> {
            ReceiptFrame receiptFrame = new ReceiptFrame(order, currentMember, totalAfterDiscount, payment, change);
            receiptFrame.setVisible(true);
            this.dispose();
        });

        SearchButton.addActionListener(e -> {
            try {
                currentMember = member.isExistingMember(PhoneNumberTextField.getText());

                if (currentMember == null) {
                    JOptionPane.showMessageDialog(null, "This user doesn't exist!!!");
                    PhoneNumberTextField.setText("");
                }

                MemberName.setText("Member Name: " + currentMember.getName());
                MemberPhoneNumber.setText("Member Phone Number: " + currentMember.getUsername());
                PointAmount.setText("Point Amount: " + currentMember.getPoint());
                discountable = (currentMember.getPoint() / 5);
                Discountable.setText("Discountable: " + discountable + " Baht");

            } catch (IOException ioException){
                JOptionPane.showMessageDialog(null, "Error!!!");
            }
        });

        CustomerClearButton.addActionListener(e -> {
            CustomerPayTextField.setText("");
        });

        PhoneNumberClearButton.addActionListener(e -> {
            PhoneNumberTextField.setText("");
        });

        PointUseClearButton.addActionListener(e -> {
            PointToUseTextField.setText("");
        });

        CONFIRMUSEPOINTButton.addActionListener(e -> {
            double usePoint = Double.parseDouble(PointToUseTextField.getText());

            if(usePoint > discountable){
                JOptionPane.showMessageDialog(null,"Point exceed discountable!");
                PointToUseTextField.setText("");
                return;
            }

            if(usePoint > total){
                JOptionPane.showMessageDialog(null,"Discount cannot exceed total!");
                PointToUseTextField.setText("");
                return;
            }

            if(Double.parseDouble(PointToUseTextField.getText()) <= discountable || discount <= total){
                discount = usePoint;
                totalAfterDiscount = total - discount;
                Discount.setText("Discount: " + discount);
                TotalAfterDiscount.setText("Total After Discount: " + totalAfterDiscount);
                PointToUseTextField.setText("");
            }
        });

        Discount.setText("Discount: " + discount);
        TotalPrice.setText("Total: " + total);
        TotalAfterDiscount.setText("Total After Discount: " + totalAfterDiscount);
        Change.setText("Change: " + change);

        CONFIRMPAYMENTButton.addActionListener(e -> {
            payment = Double.parseDouble(CustomerPayTextField.getText());
            if(payment < totalAfterDiscount){
                JOptionPane.showMessageDialog(null,"Customer pay is not enough!");
                return;
            }
            change = payment - totalAfterDiscount;
            Discount.setText("Discount: " + discount);
            TotalPrice.setText("Total: " + total);
            TotalAfterDiscount.setText("Total After Discount: " + totalAfterDiscount);
            Change.setText("Change: " + change);

            try {
                if(currentMember != null) {
                    earnPoint = (int) (totalAfterDiscount / 5);
                    usePoint = (int) discount;
                    newPoint = currentMember.getPoint() - usePoint + earnPoint;
                    currentMember.setPoints(newPoint);
                    member.updateInfo(currentMember.getUsername(), newPoint);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,"Point update error");
            }
        });
    }

    static void main() {
        ArrayList<OrderItem> list = new ArrayList<>();
        Order order1 = new Order(list);
        new PaymentFrame(order1, order1.getTotal());
    }
}
