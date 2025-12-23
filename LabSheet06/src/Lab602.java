import java.util.Scanner;

public class Lab602 {
    public static void main(String[] args) {
        String[] movies = {"Me Before you", "Titanic", "Before Sunrise", "The Holiday", "A walk to Remember"};
        float[] rate_scores = {4.2f, 4.9f, 4.4f, 3.7f, 4.3f};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a movie title: ");
        String title = scanner.next();
        System.out.println();

        int count = 0;
        for(int i= 0; i < movies.length; i++){
            if(movies[i].equalsIgnoreCase(title)){
                System.out.println("The rating score of \"" + movies[i] + "\" is " + rate_scores[i]);
                int ranked = find_rank(rate_scores, rate_scores[i]);
                System.out.println("This movies is ranked number " + ranked);
                count++;
            }
        }
        if(count == 0){
            System.out.println("Cannot fount this movie title...");
        }
    }
    public static int find_rank(float[] rate_score, float rank){
        int ranked = 1;
        for(int i = 0; i < rate_score.length; i++){
            if(rate_score[i] > rank){
                ranked++;
            }
        }
        return ranked;
    }
}
