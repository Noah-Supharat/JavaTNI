import java.util.Scanner;

public class CakeOrder2 extends Bakery{
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 1 to order Birthday Cake");
        System.out.println("Press 2 to order Cup Cake");
        System.out.println("Press 3 to order Croissant");
        System.out.print("Enter an option: ");
        int option = scanner.nextInt();

        System.out.println();

        if(option == 1 || option == 2 || option == 3) {
            System.out.println("Press 1 for Chocolate");
            System.out.println("Press 2 for Vanilla");
            System.out.println("Press 3 for Strawberry");
            System.out.println("Press 4 for Lemon");
            System.out.println("Press 5 for Red Velvet");
            System.out.println("Press 6 for other flavor");
            String flavor;
            int flavorChoice;
            while (true) {
                System.out.print("Enter a flavor number: ");
                flavorChoice = scanner.nextInt();
                if (flavorChoice == 1) {
                    flavor = "Chocolate";
                    break;
                } else if (flavorChoice == 2) {
                    flavor = "Vanilla";
                    break;
                } else if (flavorChoice == 3) {
                    flavor = "Strawberry";
                    break;
                } else if (flavorChoice == 4) {
                    flavor = "Lemon";
                    break;
                } else if (flavorChoice == 5) {
                    flavor = "Red Velvet";
                    break;
                } else if (flavorChoice == 6) {
                    System.out.print("Enter a flavor: ");
                    flavor = scanner.next();
                    break;
                }
            }

            System.out.println();

            //---------------------Birthday Cake---------------------//

            String message;
            double pound;
            if(option == 1){
                System.out.print("Enter a message: ");
                message = scanner.next();
                System.out.print("How many pounds: ");
                pound = scanner.nextDouble();

                System.out.println();

                BirthdayCake birthdayCake = new BirthdayCake(message, pound, flavor, 350);
                System.out.println(birthdayCake.toString());
            }

            //---------------------Cup Cake---------------------//

            int piece;
            if(option == 2){
                System.out.print("How many pieces: ");
                piece = scanner.nextInt();

                System.out.println();

                CupCake cupCake = new CupCake(piece, flavor, 70);
                System.out.println(cupCake.toString());
            }

            //---------------------Croissant---------------------//

            if(option == 3){
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

                Croissant croissant = new Croissant(croissantPiece, fillingRespond, fillingFlavor, toppingRespond, toppingFlavor, fruitRespond, fruitType, individualPack, flavor, 50);
                System.out.println(croissant.toString());
            }
        }

        else{
            System.out.println("Wrong option!! Try again!!");
        }
    }
}
