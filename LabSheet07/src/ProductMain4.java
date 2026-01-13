import java.util.Scanner;

import java.util.Scanner;

public class ProductMain4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[4];
        setting_product(products);
        System.out.println("Welcome to MINI SHOP!!");
        System.out.println("-----------------------------------------------");
        System.out.println("Press 1 to buy " + products[0].name + " (items = " + products[0].quantity + ")");
        System.out.println("Press 2 to buy " + products[1].name + " (items = " + products[1].quantity + ")");
        System.out.println("Press 3 to buy " + products[2].name + " (items = " + products[2].quantity + ")");
        System.out.println("Press 4 to buy " + products[3].name + " (items = " + products[3].quantity + ")");
        System.out.println("-----------------------------------------------");

        System.out.print("Enter a number: ");
        int ans = scanner.nextInt();
        while(ans < 1 || ans > 4){
            System.out.print("Invalid!! Enter a number, again: ");
            ans = scanner.nextInt();
        }
        System.out.println("-----------------------------------------------");

        Product selected = products[ans - 1];
        System.out.print("How many " + selected.name + " do you want to buy? ");
        selected.sell(scanner.nextInt());
        System.out.println();
        selected.showInfo();

    }

    public static void setting_product(Product... products){
        String[] names = {"Pens", "Pencils", "Markers", "Highlighters"};
        double[] prices = {25.5, 17.5, 30, 35};
        int[] quantities = {20, 35, 10, 40};

        for(int i = 0; i < products.length; i++){
            products[i] = new Product();
            products[i].name = names[i];
            products[i].price = prices[i];
            products[i].quantity = quantities[i];

        }
    }
}
