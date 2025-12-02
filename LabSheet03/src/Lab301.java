import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();
        if(number == 0){
            System.out.println("This is Zero number.");
        }
        else if(number % 2 == 0){
            System.out.print("This number is Even and ");
            if(number > 0){
                System.out.print("Positive number.");
            }
            else{
                System.out.print(("Negative number."));
            }
        }
        else{
            System.out.print("This number is odd and ");
            if(number > 0){
                System.out.print("Positive number.");
            }
            else{
                System.out.print(("Negative number."));
            }
        }
    }
}
