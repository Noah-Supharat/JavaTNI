import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class OrderFrame extends JFrame{
    ArrayList<OrderItem> orderList = new ArrayList<>();
    ArrayList<OrderItem> list = new ArrayList<>();
    Order order = new Order(list);
    String selectedMenu = "";
    int price = 0;
    double total = 0;
    String temp;
    String sweet;

    private JPanel OrderPage;
    private JPanel WESTSIDE;
    private JPanel EASTSIDE;
    private JPanel OPTION;
    private JPanel TOTAL;
    private JButton MochaButton;
    private JButton MilkTeaButton;
    private JButton LycheeSodaButton;
    private JButton PeachSodaButton;
    private JButton MelonSodaButton;
    private JButton LemonSodaButton;
    private JButton ThaiTeaButton;
    private JButton GreenTeaButton;
    private JButton LatteButton;
    private JButton AmericanoButton;
    private JButton EspressoButton;
    private JButton CappuccinoButton;
    private JRadioButton HOTRadioButton;
    private JRadioButton COLDRadioButton;
    private JRadioButton a100RadioButton;
    private JRadioButton a75RadioButton;
    private JRadioButton a0RadioButton;
    private JRadioButton a50RadioButton;
    private JRadioButton a25RadioButton;
    private JButton ADDButton;
    private JTable OrderTable;
    private JButton CONFIRMButton;
    private JLabel TotalPrice;
    private JButton DELETEButton;
    private JButton CLEARORDERButton;
    private JPanel Americano;
    private JPanel Espresso;
    private JPanel Cappuccino;
    private JPanel Mocha;
    private JPanel PeachSoda;
    private JPanel LycheeSoda;
    private JPanel LemonSoda;
    private JPanel MelonSoda;
    private JPanel Latte;
    private JPanel MilkTea;
    private JPanel ThaiTea;
    private JPanel GreenTea;
    private JLabel MENU;
    private JPanel WEST;
    private JScrollPane Scroll;

    public OrderFrame(){
        setTitle("Order Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900,600);
        setContentPane(OrderPage);
        setLocationRelativeTo(null);
        setVisible(true);

        WEST.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        WESTSIDE.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        WESTSIDE.setLayout(new GridLayout(3, 4, 10, 10));
        WESTSIDE.add(Americano);
        WESTSIDE.add(Espresso);
        WESTSIDE.add(Cappuccino);
        WESTSIDE.add(Mocha);
        WESTSIDE.add(Latte);
        WESTSIDE.add(GreenTea);
        WESTSIDE.add(ThaiTea);
        WESTSIDE.add(MilkTea);
        WESTSIDE.add(LemonSoda);
        WESTSIDE.add(MelonSoda);
        WESTSIDE.add(PeachSoda);
        WESTSIDE.add(LycheeSoda);

        Americano.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        AmericanoButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        AmericanoButton.setFocusPainted(false);

        Espresso.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        EspressoButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        EspressoButton.setFocusPainted(false);

        Cappuccino.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        CappuccinoButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        CappuccinoButton.setFocusPainted(false);

        Mocha.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        MochaButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        MochaButton.setFocusPainted(false);

        Latte.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        LatteButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        LatteButton.setFocusPainted(false);

        GreenTea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        GreenTeaButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        GreenTeaButton.setFocusPainted(false);

        ThaiTea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        ThaiTeaButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        ThaiTeaButton.setFocusPainted(false);

        MilkTea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        MilkTeaButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        MilkTeaButton.setFocusPainted(false);

        LemonSoda.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        LemonSodaButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        LemonSodaButton.setFocusPainted(false);

        MelonSoda.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        MelonSodaButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        MelonSodaButton.setFocusPainted(false);

        PeachSoda.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        PeachSodaButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        PeachSodaButton.setFocusPainted(false);

        LycheeSoda.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        LycheeSodaButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        LycheeSodaButton.setFocusPainted(false);

        OPTION.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        TOTAL.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        ButtonGroup SweetnessGroup = new ButtonGroup();
        SweetnessGroup.add(a0RadioButton);
        SweetnessGroup.add(a25RadioButton);
        SweetnessGroup.add(a50RadioButton);
        SweetnessGroup.add(a75RadioButton);
        SweetnessGroup.add(a100RadioButton);

        ButtonGroup TemperatureGroup = new ButtonGroup();
        TemperatureGroup.add(HOTRadioButton);
        TemperatureGroup.add(COLDRadioButton);

        ADDButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        DELETEButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        CLEARORDERButton.setBorder(new EmptyBorder(5, 10, 5, 10));
        CONFIRMButton.setBorder(new EmptyBorder(5, 10, 5, 10));

        DefaultTableModel model;

        model = new DefaultTableModel();

        model.addColumn("Menu");
        model.addColumn("Temp");
        model.addColumn("Sweet");
        model.addColumn("Price");

        OrderTable.setModel(model);

        AmericanoButton.addActionListener(e -> {
            selectedMenu = "Americano";
            price = 65;
        });

        EspressoButton.addActionListener(e -> {
            selectedMenu = "Espresso";
            price = 55;
        });

        CappuccinoButton.addActionListener(e -> {
            selectedMenu = "Cappuccino";
            price = 60;
        });

        MochaButton.addActionListener(e -> {
            selectedMenu = "Mocha";
            price = 65;
        });

        LatteButton.addActionListener(e -> {
            selectedMenu = "Latte";
            price = 65;
        });

        GreenTeaButton.addActionListener(e -> {
            selectedMenu = "Green Tea";
            price = 50;
        });

        ThaiTeaButton.addActionListener(e -> {
            selectedMenu = "Thai Tea";
            price = 45;
        });

        MilkTeaButton.addActionListener(e -> {
            selectedMenu = "Milk Tea";
            price = 45;
        });

        LemonSodaButton.addActionListener(e -> {
            selectedMenu = "Lemon Soda";
            price = 40;
        });

        MelonSodaButton.addActionListener(e -> {
            selectedMenu = "Melon Soda";
            price = 40;
        });

        PeachSodaButton.addActionListener(e -> {
            selectedMenu = "Peach Soda";
            price = 40;
        });

        LycheeSodaButton.addActionListener(e -> {
            selectedMenu = "Lychee Soda";
            price = 40;
        });

        ADDButton.addActionListener(e -> {
            if(HOTRadioButton.isSelected()){
                temp = "HOT";
            } else if (COLDRadioButton.isSelected()) {
                temp = "COLD";
            }

            if (selectedMenu.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Please Select Menu");
                return;
            }

            if(!HOTRadioButton.isSelected() && !COLDRadioButton.isSelected()){
                JOptionPane.showMessageDialog(null, "Please Select Temperature");
                return;
            }

            if (!a100RadioButton.isSelected() && !a75RadioButton.isSelected() && !a50RadioButton.isSelected() && !a25RadioButton.isSelected() && !a0RadioButton.isSelected()){
                JOptionPane.showMessageDialog(null, "Please Select Sweetness");
                return;
            }

            if(a0RadioButton.isSelected()){
                sweet = "0%";
            } else if (a25RadioButton.isSelected()) {
                sweet = "25%";
            } else if (a50RadioButton.isSelected()) {
                sweet = "50%";
            } else if (a75RadioButton.isSelected()) {
                sweet = "75%";
            } else if (a100RadioButton.isSelected()) {
                sweet = "100%";
            }

            model.addRow(new Object[]{
                    selectedMenu, temp, sweet, price
            });

            total += price;
            TotalPrice.setText("Total: " + total);

            Product product = new Product(selectedMenu, price, 1);
            OrderItem item = new OrderItem(product, 1);

            order.getItems().add(item);
            orderList.add(item);

            TemperatureGroup.clearSelection();
            SweetnessGroup.clearSelection();
            selectedMenu = "";
        });

        DELETEButton.addActionListener(e -> {
            int row = OrderTable.getSelectedRow();
            int itemPrice = (int) model.getValueAt(row, 3);
            total -= itemPrice;
            TotalPrice.setText("Total: " + total);
            model.removeRow(row);
            orderList.remove(row);
        });

        CLEARORDERButton.addActionListener(e -> {
            model.setRowCount(0);
            orderList.clear();
            total = 0;
            TotalPrice.setText("Total: " + total);
        });

        CONFIRMButton.addActionListener(e -> {
            Order order = new Order(orderList);

            if (total == 0){
                JOptionPane.showMessageDialog(null, "Please Select Menu");
                return;
            }

            PaymentFrame paymentFrame = new PaymentFrame(order, total);
            paymentFrame.setVisible(true);
            this.dispose();
        });

        ADDButton.setFocusPainted(false);
        DELETEButton.setFocusPainted(false);
        CLEARORDERButton.setFocusPainted(false);
        CONFIRMButton.setFocusPainted(false);

        HOTRadioButton.setFocusPainted(false);
        COLDRadioButton.setFocusPainted(false);

        a100RadioButton.setFocusPainted(false);
        a75RadioButton.setFocusPainted(false);
        a50RadioButton.setFocusPainted(false);
        a25RadioButton.setFocusPainted(false);
        a0RadioButton.setFocusPainted(false);

        OrderTable.getTableHeader().setBackground(new Color(168, 126, 83));
        OrderTable.getTableHeader().setForeground(new Color(103, 61, 41));
        OrderTable.getTableHeader().setFont(new Font("UD Digi Kyokasho N", Font.BOLD, 12));
        OrderTable.getTableHeader().setBorder(BorderFactory.createLineBorder(new Color(103, 61, 41)));
        OrderTable.setGridColor(new Color(103, 61, 41));
        Scroll.setBorder(null);
    }

    static void main() {
        new OrderFrame();
    }
}
