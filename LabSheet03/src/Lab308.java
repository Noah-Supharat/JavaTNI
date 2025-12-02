import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number to input: ");
        int amountOfInputNumber = scanner.nextInt();
        int maximumNumber = Integer.MIN_VALUE;
        int minimumNumber = Integer.MAX_VALUE;
        int evenNumber = 0;
        int oddNumber = 0;
        int numberInput;

        for(int i = 1; i <= amountOfInputNumber; i++){
            System.out.print("Enter number " + i + ": ");
            numberInput = scanner.nextInt();

            if(numberInput > maximumNumber){
                maximumNumber = numberInput;
            }
            else if(numberInput < minimumNumber){
                minimumNumber = numberInput;
            }

            if(numberInput % 2 != 0){
                oddNumber += 1;
            }
            else{
                evenNumber += 1;
            }
        }
        System.out.println();
        System.out.println("Maximum = " + maximumNumber);
        System.out.println("Minimum = " + minimumNumber);
        System.out.println("Even number = " + evenNumber);
        System.out.println("Odd  number = " + oddNumber);
    }
}
