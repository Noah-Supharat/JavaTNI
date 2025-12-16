import javax.swing.*;
import java.text.DecimalFormat;

public class Lab501 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##.00");
        int answer = JOptionPane.showConfirmDialog(null,"Do you want to check your BMI","Check BMI",JOptionPane.YES_NO_OPTION);
        if(answer == JOptionPane.YES_OPTION){
            double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight(kg.):"));
            double height_cm = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(cm.):"));
            JOptionPane.showMessageDialog(null,"Your BMI = " + df.format(cal_bmi(weight, height_cm)) + "\nYour BMI result = " + check_bmi(cal_bmi(weight, height_cm)));
        }
        else{
            JOptionPane.showMessageDialog(null,"END PROGRAM!!!");
        }
    }
    public static double cal_bmi(double weight, double height_cm){
        double height_m = height_cm / 100;
        return weight / (height_m * height_m);
    }
    public static String check_bmi(double bmi){
        if (bmi < 18.5){
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Healthy weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        }
        return "Obese";
    }
}
