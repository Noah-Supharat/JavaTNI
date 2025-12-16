import java.util.Scanner;

public class Ex501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (check_type_number(number).equals("Zero")){
            System.out.println(number + " is " + check_type_number(number) + " number");
        }
        else{
            System.out.println(number + " is " + (is_even(number)?"Even and " :"Odd and ") + check_type_number(number) + " number");
        }
    }

    public static boolean is_even(int number){
        return number % 2 == 0;
    }

    public static String check_type_number(int number){
        if(number > 0){
            return "Positive";
        }
        else if (number < 0) {
            return "Negative";
        }
        return "Zero";
    }

}
