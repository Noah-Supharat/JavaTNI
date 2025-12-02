import javax.swing.*;
import java.text.DecimalFormat;

public class Lab302 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###.0");

        String name = JOptionPane.showInputDialog("Enter your name:");
        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height(cm.):"));
        int gender = JOptionPane.showConfirmDialog(null,"Are you biological gender is Male?","Gender",JOptionPane.YES_NO_OPTION);
        if(gender == JOptionPane.YES_OPTION){
            int weight = height - 100;
            JOptionPane.showMessageDialog(null,"Hello,Mr." + name +
                    "\nIf your height is " + df.format(height) + " cm." +
                    "\nYour weight should be " + df.format(weight) + " kg.") ;
        }
        else if(gender == JOptionPane.NO_OPTION){
            int genderConfirm = JOptionPane.showConfirmDialog(null,"Are you biological gender is Female?","Gender",JOptionPane.YES_NO_OPTION);
            if(genderConfirm == JOptionPane.YES_OPTION){
                int weight = height - 110;
                JOptionPane.showMessageDialog(null,"Hello,Ms." + name +
                        "\nIf your height is " + df.format(height) + " cm." +
                        "\nYour weight should be " + df.format(weight) + " kg.") ;
            }
            else{
                JOptionPane.showMessageDialog(null, "You can use BMI to measure your weight and height");
            }
        }
    }
}
