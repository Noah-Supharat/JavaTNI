import java.util.Scanner;

public class CakeOrder extends Bakery{
    static void main() {
        Scanner scanner = new Scanner(System.in);

        //-----------------------BirthDay Cake-----------------------//

        System.out.println("Birthday Cake's Details:");
        System.out.print("Enter a message on cake : ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor : ");
        String birthdayCakeFlavor = scanner.nextLine();
        System.out.print("How many pound : ");
        double pound = scanner.nextDouble();

        System.out.println();

        BirthdayCake birthdayCake = new BirthdayCake(message, pound, birthdayCakeFlavor, 350);
        System.out.println(birthdayCake.toString());

        System.out.println();

        //-----------------------Cup Cake-----------------------//

        System.out.println("Cup Cake's Detail:");
        System.out.print("Enter a flavor : ");
        String cupCakeFlavor = scanner.next();
        System.out.print("How many piece : ");
        int cupCakePiece = scanner.nextInt();

        System.out.println();

        CupCake cupCake = new CupCake(cupCakePiece, cupCakeFlavor, 65);
        System.out.println(cupCake.toString());

        System.out.println();

        //-----------------------Croissant-----------------------//

        System.out.println("Croissant's Detail:");
        System.out.print("Enter a flavor : ");
        String croissantFlavor = scanner.next();
        System.out.print("How many piece : ");
        int croissantPiece = scanner.nextInt();
        String fillingFlavor;
        System.out.print("Do you want to get filling(YES/NO) * +10 THB * : ");
        boolean fillingRespond = ((scanner.next()).equalsIgnoreCase("yes"));
        if(fillingRespond){
            System.out.print("Enter a filling flavor : ");
            fillingFlavor = scanner.next();
        }
        else{
            fillingFlavor = "";
        }
        String toppingFlavor;
        System.out.print("Do you want to get topping(YES/NO) * +5 THB * : ");
        boolean toppingRespond = ((scanner.next()).equalsIgnoreCase("yes"));
        if(toppingRespond){
            System.out.print("Enter a topping flavor : ");
            toppingFlavor = scanner.next();
        }
        else{
            toppingFlavor = "";
        }
        boolean fruitRespond;
        String fruitType;
        if(toppingRespond){
            System.out.print("Do you want to get fruit topping(YES/NO) * +10 THB * : ");
            fruitRespond = ((scanner.next()).equalsIgnoreCase("yes"));
            if(fruitRespond){
                System.out.print("Enter a fruit : ");
                fruitType = scanner.next();
            }
            else{
                fruitType = "";
            }
        }
        else{
            fruitRespond = false;
            fruitType = "";
        }
        System.out.print("Do you want it individual pack(YES/NO) : ");
        boolean individualPack = (scanner.next()).equalsIgnoreCase("yes");

        System.out.println();

        Croissant croissant = new Croissant(croissantPiece, fillingRespond, fillingFlavor, toppingRespond, toppingFlavor, fruitRespond, fruitType, individualPack, croissantFlavor, 50);
        System.out.println(croissant.toString());

        System.out.println();

        //-----------------------Total-----------------------//

        System.out.println("Total price = " + ((birthdayCake.calculateTotalPrice()) + (cupCake.calculateTotalPrice()) + (croissant.calculateTotalPrice())));
    }
}
