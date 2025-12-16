import java.util.Scanner;

public class Lab503 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = scanner.nextLine();
        System.out.println();
        System.out.println("List of vowel in \"" + message + "\"");
        System.out.println("The letter 'A' appears " + count_vowel(message, 'A') + " time(s)");
        System.out.println("The letter 'E' appears " + count_vowel(message, 'E') + " time(s)");
        System.out.println("The letter 'I' appears " + count_vowel(message, 'I') + " time(s)");
        System.out.println("The letter 'O' appears " + count_vowel(message, 'O') + " time(s)");
        System.out.println("The letter 'U' appears " + count_vowel(message, 'U') + " time(s)");
    }
    public static int count_vowel(String message, char letter){
        int count = 0;
        String upperMessage = message.toUpperCase();
        char upperChar = Character.toUpperCase(letter);

        for(int i = 0; i < upperMessage.length(); i++){
            if (upperMessage.charAt(i) == upperChar) {
                count++;
            }
        }
        return count;
    }
}
