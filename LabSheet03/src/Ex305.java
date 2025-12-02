import javax.swing.*;

public class Ex305 {
    public static void main(String[] args) {
        int score = Integer.parseInt(JOptionPane.showInputDialog("Enter your score:"));
        while(score> 100 || score < 0){
            score = Integer.parseInt(JOptionPane.showInputDialog("Invalid score!!\nEnter your score:"));
        }
        if(score >= 50){
            JOptionPane.showMessageDialog(null,"Your score is " + score + " (PASS)");
        }
        else{
            JOptionPane.showMessageDialog(null,"Your score is " + score + " (FAIL)");
        }
    }
}
