import javax.swing.*;
import java.text.DecimalFormat;

public class Lab304 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        float weight = Float.parseFloat(JOptionPane.showInputDialog("Enter your weight(kg.):"));
        float height = Float.parseFloat(JOptionPane.showInputDialog("Enter your height(cm.):"));
        float heightInM = height/100;
        double bmi = weight / (heightInM * heightInM);
        String bmiResult;
        if(bmi < 18.5){
            bmiResult = "Underweight";
        }
        else if(bmi < 24.9){
            bmiResult = "Healthy Weight";
        }
        else if(bmi < 29.9){
            bmiResult = "Overweight";
        }
        else{
            bmiResult = "Obese";
        }
        JOptionPane.showMessageDialog(null,"Your BMI is " + df.format(bmi) + "\nBMI result is " + bmiResult);
    }
}
