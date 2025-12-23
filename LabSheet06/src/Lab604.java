import java.util.Scanner;

public class Lab604 {
    public static void main(String[] args) {
        int[] numbers = {47, 13, 82, 17, 61, 29, 94, 36};
        display_array(numbers);
        System.out.println();
        int index = input_index(numbers);
        System.out.println();
        System.out.println("The number at index " + index + " is " + numbers[index]);
        if(index > 0){
            System.out.println("The number before index " + index + " is " + numbers[index - 1]);
        }
        else{
            System.out.println("The number before index " + index + " is Out of range!!");
        }
        if(index < numbers.length-1){
            System.out.println("The number after  index " + index + " is " + numbers[index + 1]);
        }
        else{
            System.out.println("The number after  index " + index + " is Out of range!!");
        }
    }
    public static void display_array(int[] numbers){
        System.out.print("List of numbers in array: ");
        for(int _numbers : numbers){
            System.out.print(_numbers + " ");
        }
    }
    public static int input_index(int[] numbers){
        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index: ");
        index = scanner.nextInt();
        while(!check_index(numbers, index)){
            System.out.print("Invalid index!! Enter index, again: ");
            index = scanner.nextInt();
        }
        return index;
    }
    public static boolean check_index(int[] numbers, int index){
        return index >= 0 && index < numbers.length;
    }
}
