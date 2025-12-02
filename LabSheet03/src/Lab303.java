import java.util.Scanner;

public class Lab303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for X coordinate: ");
        int xCoordinate = scanner.nextInt();
        System.out.print("Enter the value for Y coordinate: ");
        int yCoordinate = scanner.nextInt();
        if(xCoordinate == 0 && yCoordinate == 0){
            System.out.println("The coordinate point (0,0) lies in the origin");
        }
        else if(xCoordinate > 0 && yCoordinate > 0){
            System.out.println("The coordinate point (" + xCoordinate + "," + yCoordinate + ") lies in the First quadrant");
        }
        else if(xCoordinate < 0 && yCoordinate > 0){
            System.out.println("The coordinate point (" + xCoordinate + "," + yCoordinate + ") lies in the Second quadrant");
        }
        else if(xCoordinate < 0 && yCoordinate < 0){
            System.out.println("The coordinate point (" + xCoordinate + "," + yCoordinate + ") lies in the Third quadrant");
        }
        else if(xCoordinate > 0 && yCoordinate < 0){
            System.out.println("The coordinate point (" + xCoordinate + "," + yCoordinate + ") lies in the Fourth quadrant");
        }
        else{
            System.out.println("The coordinate point (" + xCoordinate + "," + yCoordinate + ") lies in between two quadrants");
        }
    }
}
