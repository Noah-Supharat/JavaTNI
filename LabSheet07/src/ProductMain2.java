import java.util.Scanner;

public class ProductMain2 {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name = "Pens";
        p1.price = 10.5;
        p1.quantity = 50;

        Product p2 = new Product();
        p2.name = "Notebooks";
        p2.price = 25.75;
        p2.quantity = 20;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Mini Shop");
        System.out.println("------------------------------");
        System.out.println("Press [1] to buy Pen");
        System.out.println("Press [2] to buy Notebook");
        System.out.print("Enter a number: ");
        int ans = scanner.nextInt();
        while(ans != 1 && ans != 2){
            System.out.print("Invalid number! Enter a number, again: ");
            ans = scanner.nextInt();
        }

        if(ans == 1){
            p1.showInfo();
            System.out.println("--------------------------------------");
            System.out.print("How many Pens do you want to buy? ");
            p1.sell(scanner.nextInt());
            System.out.println("--------------------------------------");
            p1.showInfo();
        }

        if(ans == 2){
            p2.showInfo();
            System.out.println("--------------------------------------");
            System.out.print("How many Notebooks do you want to buy? ");
            p2.sell(scanner.nextInt());
            System.out.println("--------------------------------------");
            p2.showInfo();
        }
    }
}
