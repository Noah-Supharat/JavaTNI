import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.io.IOException;
import java.util.ArrayList;

public class MembershipFrame extends JFrame {
    double total;

    private JPanel MembershipPage;
    private JTextField NameTextField;
    private JButton NameClearButton;
    private JButton PhoneNumberClearButton;
    private JTextField PhoneNumberTextField;
    private JButton CONFIRMButton;
    private JButton CANCELButton;

    public MembershipFrame(Order order, double total) {

        setTitle("Membership Register Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900,600);
        setContentPane(MembershipPage);
        setLocationRelativeTo(null);
        setVisible(true);

        MembershipPage.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        NameClearButton.addActionListener(e -> {
            NameTextField.setText("");
        });

        NameTextField.setBorder(new EmptyBorder(5, 10, 5, 10));

        PhoneNumberClearButton.addActionListener(e -> {
            PhoneNumberTextField.setText("");
        });

        PhoneNumberTextField.setBorder(new EmptyBorder(5, 10, 5, 10));

        NameClearButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        NameClearButton.setFocusPainted(false);
        PhoneNumberClearButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        PhoneNumberClearButton.setFocusPainted(false);
        CANCELButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        CANCELButton.setFocusPainted(false);
        CONFIRMButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        CONFIRMButton.setFocusPainted(false);

        CANCELButton.addActionListener(e -> {
            PaymentFrame paymentFrame = new PaymentFrame(order, total);
            paymentFrame.setVisible(true);
            this.dispose();
        });

        CONFIRMButton.addActionListener(e -> {
            String name = NameTextField.getText();
            name = name.trim().replace(" ", "-");
            String phoneNumber = PhoneNumberTextField.getText();

            if (name.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please enter name");
                return;
            }

            if (phoneNumber.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please enter phone number");
                return;
            }

            if(!phoneNumber.matches("\\d{10}")){
                JOptionPane.showMessageDialog(null, "Phone number must be 10 digits");
                return;
            }

            Member member = new Member(phoneNumber, "000000", name, 0);
            try {
                phoneNumber = PhoneNumberTextField.getText().trim();
                Member found = member.isExistingMember(phoneNumber);

                if(found != null){
                    JOptionPane.showMessageDialog(null, "This user already exist!!!");
                    PhoneNumberTextField.setText("");
                    return;
                }

                member.registerMember(phoneNumber, "000000", name);
            } catch (IOException ioException){
                JOptionPane.showMessageDialog(null, "Error!!!");
            }

            PaymentFrame paymentFrame = new PaymentFrame(order, total);
            paymentFrame.setVisible(true);
            this.dispose();
        });
    }

    static void main() throws IOException{
        ArrayList<OrderItem> list = new ArrayList<>();
        Order order1 = new Order(list);
        new MembershipFrame(order1, order1.getTotal());
    }
}
