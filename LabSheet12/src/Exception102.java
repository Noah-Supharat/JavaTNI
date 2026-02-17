import javax.swing.*;
import java.util.InputMismatchException;

public class Exception102 {
    public static void main(String[] args) {
        int number = 0;
        boolean flag = false;

        while(!flag){
            String input = JOptionPane.showInputDialog("Enter an integer:");
            try{
                number = Integer.parseInt(input);
                flag = true;
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error: For input string: \"" + input + "\"", "Error Message", JOptionPane.WARNING_MESSAGE);
            }
        }

        JOptionPane.showMessageDialog(null, "You inputted number = " + number);
    }
}
