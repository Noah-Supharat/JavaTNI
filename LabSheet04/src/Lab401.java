import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter your full name");
        while (name.trim().indexOf(" ") == -1) {
            name = JOptionPane.showInputDialog(null, "Enter your full name");
        }
        String[] splitName = name.split(" ");
        String firstName = splitName[0];
        String newFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        String lastName = splitName[splitName.length - 1].toUpperCase();
        if (splitName.length > 2) {
            lastName = splitName[1].toUpperCase() + " " + splitName[splitName.length - 1].toUpperCase();
        }
        else{
            JOptionPane.showMessageDialog(null,"Welcome, " + newFirstName + " " + lastName);
        }

    }
}
