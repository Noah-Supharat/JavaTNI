import java.util.Scanner;

public class Ex202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student-id   : ");
        String studentId = scanner.nextLine();
        System.out.print("Enter student name : ");
        String studentName = scanner.nextLine();

        System.out.println();
        System.out.println("Student-Id   : " + studentId);
        System.out.println("Student name : " + studentName);
    }
}
