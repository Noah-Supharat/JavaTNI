import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number 2: ");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println();
        System.out.println("Summation = " + (firstNumber + secondNumber));
        System.out.println("Substraction = " + (firstNumber - secondNumber));
        System.out.println("Multiplication = " + (firstNumber * secondNumber));
        System.out.println("Division = " + ((double)firstNumber / secondNumber));
        System.out.println("Modulus = " + (firstNumber % secondNumber));
    }
}
