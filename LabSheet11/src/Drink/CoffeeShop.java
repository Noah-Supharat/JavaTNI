package Drink;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        int espressoCount = 0;
        int frappucinoCount = 0;
        int option;
        double totalPrice = 0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Press 1 for ordering Espresso");
            System.out.println("Press 2 for ordering Frappucino");
            System.out.print("Enter an option: ");
            option = scanner.nextInt();

            if(option == 1){
                ++espressoCount;
                Espresso espresso = orderEspresso();
                totalPrice += espresso.calculateFinalPrice();
            } else if (option == 2){
                ++frappucinoCount;
                Frappuccino frappuccino = orderFrappucino();
                totalPrice += frappuccino.calculateFinalPrice();
            } else{
                System.out.println();
                break;
            }

            System.out.print("Do you want to order more [y/Y]? ");
            String ans = scanner.next();

            System.out.println();

            if(!ans.equalsIgnoreCase("Y")){
                break;
            }
        }

        System.out.println("You ordered " + espressoCount + " Espresso");
        System.out.println("You ordered " + frappucinoCount + " Frappucino");
        System.out.println("Total price = " + totalPrice);
    }

    public static Espresso orderEspresso(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a size: ");
        String size = scanner.next();

        Espresso espresso = new Espresso(size);

        System.out.print("Press 'y' or 'Y' to for adding a shot ");
        String shotAns = scanner.next();
        if(shotAns.equalsIgnoreCase("Y")){
            System.out.print("How many shots for adding in Espresso: ");
            int shot = scanner.nextInt();
            espresso.addShot(shot);
        }

        System.out.println("Your order: Espresso (Size: " + size.toUpperCase() + ")");
        System.out.println("Total Price = " + espresso.calculateFinalPrice() + " Baht");

        System.out.println();

        return espresso;
    }

    public static Frappuccino orderFrappucino(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a size: ");
        String size = scanner.next();

        System.out.print("Do you would like to add whipped cream [y/Y] ");
        String whipped = scanner.next();

        Frappuccino frappuccino = new Frappuccino(size, (whipped.equalsIgnoreCase("Y")));

        System.out.println("Your order: Frappucino (Size: " + size.toUpperCase() + ")");
        System.out.println("Total Price = " + frappuccino.calculateFinalPrice() + " Baht");

        System.out.println();

        return frappuccino;
    }
}