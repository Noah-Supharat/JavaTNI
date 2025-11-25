import javax.swing.JOptionPane;
import java.text.*;

public class Ex203 {
    public static void main(String[] args) {
        final int lectureCoursePricePerCredit = 1900;
        final int laboratoryCoursePricePerCredit = 3500;

        int lectureCreditsRegister = Integer.parseInt(JOptionPane.showInputDialog(null,
                "How many credits of lecture courses have you register for?",
                "Input", JOptionPane.QUESTION_MESSAGE));
        int laboratoryCreditsRegister = Integer.parseInt(JOptionPane.showInputDialog(null,
                "How many credits of laboratory courses have you register for?",
                "Input", JOptionPane.QUESTION_MESSAGE));

        double lectureTotalPrice = lectureCreditsRegister * lectureCoursePricePerCredit;
        double laboratoryTotalPrice = laboratoryCreditsRegister * laboratoryCoursePricePerCredit;
        double totalPrice = lectureTotalPrice + laboratoryTotalPrice;

        DecimalFormat df = new DecimalFormat("#,###.00");

        JOptionPane.showMessageDialog(null,
                ("Lecture      : " + lectureCreditsRegister + "x" + lectureCoursePricePerCredit + "=" + df.format(lectureTotalPrice) +
                "\nLaboratory: " + laboratoryCreditsRegister + "x" + laboratoryCoursePricePerCredit + "=" + df.format(laboratoryTotalPrice) +
                        "\nTotal price: " + df.format(totalPrice)),
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
