import javax.swing.JOptionPane;

public class Lab205 {
    public static void main(String[] args) {
        int minutesInput = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Input minutes:", "Input", JOptionPane.QUESTION_MESSAGE));
        int hour = minutesInput / 60;
        int minute = minutesInput % 60;
        JOptionPane.showMessageDialog(null, (minutesInput + " minutes is " + hour + " hour " + minute + " minute"));
    }
}
