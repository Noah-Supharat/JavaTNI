import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        boolean is_loop = true;

        while(is_loop){
            System.out.print("Enter a number: ");
            try{
                number = scanner.nextInt();
                is_loop = false;
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