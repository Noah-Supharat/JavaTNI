import java.util.Scanner;

public class Ex304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message to display on loop: ");
        String messageToDisplay = scanner.nextLine();
        System.out.print("Enter a number of loop: ");
        int numberOfLoop = scanner.nextInt();
        System.out.println();

        for(int i = 1; i <= numberOfLoop; i++){
            System.out.println(i + " " + messageToDisplay);
        }
    }
}
