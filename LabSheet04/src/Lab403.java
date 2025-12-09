import javax.swing.*;

public class Lab403 {
    public static void main(String[] args) {
        final String USERNAME = "Admin";
        final String PASSWORD = "Admin1234";

        String usernameInput = JOptionPane.showInputDialog(null,"Enter username:");
        String passwordInput = JOptionPane.showInputDialog(null,"Enter password:");

        if(!((USERNAME.equalsIgnoreCase(usernameInput)) && (PASSWORD.equals(passwordInput)))){
            JOptionPane.showMessageDialog(null,"Login Fail...","Incorrect username or password",JOptionPane.WARNING_MESSAGE);
            while(!((USERNAME.equalsIgnoreCase(usernameInput)) && (PASSWORD.equals(passwordInput)))){
                usernameInput = JOptionPane.showInputDialog(null,"Enter username:");
                passwordInput = JOptionPane.showInputDialog(null,"Enter password:");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Login success!!");
        }
    }
}
