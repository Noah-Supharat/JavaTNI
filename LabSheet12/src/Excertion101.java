import java.util.InputMismatchException;
import java.util.Scanner;

public class Excertion101 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int number;

        while(true){
            System.out.print("Enter a number: ");
            try{
                number = scanner.nextInt();
                break;
            }
            catch (InputMismatchException e){
                System.out.print("Invalid Data!! ");
                scanner.nextLine();
            }
        }

        System.out.println();
        System.out.println("You inputted number = " + number);
    }
}
