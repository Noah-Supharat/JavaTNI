import java.util.Scanner;

public class CakeOrder extends Bakery{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //-----------------BirthdayCake---------------//

        System.out.println("Birthday Cake's Details:");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor: ");
        String BirthdayCakeFlavor = scanner.nextLine();
        System.out.print("How many pound: ");
        double pound = scanner.nextDouble();

        BirthdayCake b1 = new BirthdayCake(message, pound, BirthdayCakeFlavor, 350);
        System.out.println(b1.toString());

        System.out.println();

        //-------------------CupCake-----------------//

        System.out.println("Cup Cake's Details:");
        System.out.print("Enter a flavor: ");
        String cupcakeFlavor = scanner.next();
        System.out.print("How many piece: ");
        int piece = scanner.nextInt();

        CupCake c1 = new CupCake(piece, cupcakeFlavor, 65);
        System.out.println(c1.toString());

        System.out.println();

        //------------------Croissant----------------//

        String fillingRespond;
        String toppingRespond;

        System.out.println("Croissant's Details:");
        System.out.print("Enter a flavor: ");
        String croissantFlavor = scanner.next();
        System.out.print("How many piece: ");
        int Cspiece = scanner.nextInt();
        System.out.print("Do you want to get filling (YES/NO) ");
        boolean filling = ((fillingRespond = scanner.next()).equalsIgnoreCase("yes"));
        System.out.print("Do you want to get topping (YES/NO) ");
        boolean topping = ((fillingRespond = scanner.next()).equalsIgnoreCase("yes"));

        Croissant cs1 = new Croissant(Cspiece, filling, topping, croissantFlavor, 55);
        System.out.println(cs1.toString());

        System.out.println();

        System.out.println("Total price = " + ((b1.calculateTotalPrice()) + (c1.calculateTotalPrice()) + (cs1.calculateTotalPrice())));

    }
}
