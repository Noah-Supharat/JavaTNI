import java.util.Scanner;

public class Lab404 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stop = "Stop";
        System.out.print("Enter word: ");
        String word = scanner.nextLine();
        String concatWord = word;

        while(!word.equalsIgnoreCase(stop)){
            System.out.print("Enter word: ");
            word = scanner.nextLine();
            if(!word.equalsIgnoreCase("stop")){
                concatWord = concatWord.concat(" " + word);
            }
        }

        System.out.println(concatWord);
    }
}
