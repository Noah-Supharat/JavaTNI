import java.util.Scanner;

public class Ex302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter mid-term score: ");
        int midTermScore = scanner.nextInt();
        System.out.print("Enter final    score: ");
        int finalScore = scanner.nextInt();
        int totalScore = midTermScore + finalScore;

        System.out.println();
        System.out.println("Your score is " + totalScore);

        if(totalScore > 100 || totalScore < 0){
            System.out.println("Error score!!");
        }
        else{
            if(totalScore >= 80){
                System.out.println("You get grade A");
            }
            else if(totalScore >= 70){
                System.out.println("You get grade B");
            }
            else if(totalScore >= 60){
                System.out.println("You get grade C");
            }
            else if(totalScore >= 50){
                System.out.println("You get grade D");
            }
            else{
                System.out.println("You get grade F");
            }
        }
    }
}
