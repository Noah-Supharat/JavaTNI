import java.util.Scanner;

public class Ex303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter number 3: ");
        int number3 = scanner.nextInt();
        System.out.println();

        System.out.println("All numbers " + (number1 == number2 && number2 == number3 ? "are" : "are NOT") + " the same.");
    }
}
