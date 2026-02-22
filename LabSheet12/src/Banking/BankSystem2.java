package Banking;

import java.io.IOException;
import java.util.Scanner;

public class BankSystem2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your account: ");
        String accountId = scanner.next();

        AccountTransaction account = new AccountTransaction(accountId);

        System.out.println();

        boolean flag = false;
        int menu;
        double amount;
        if(account.hasAccountId()){
            System.out.println("Press 1 to deposit");
            System.out.println("Press 2 to withdraw");
            System.out.println("Press 3 to check balance");
            System.out.println("Press 4 to exit");

            while (!flag){
                System.out.println();
                System.out.print("Enter a menu: ");
                menu = scanner.nextInt();

                if(menu == 1){
                    System.out.print("Enter amount to deposit: ");
                    amount = scanner.nextDouble();
                    account.deposit(amount);
                    System.out.println("Your balance = " + account.checkBalance());
                } else if (menu == 2) {
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextDouble();
                    account.withdraw(amount);
                    System.out.println("Your balance = " + account.checkBalance());
                } else if (menu == 3) {
                    System.out.println("Your balance = " + account.checkBalance());
                } else if (menu == 4) {
                    flag = true;
                }
            }
        }
        else {
            System.out.println("Bank account not found...");
        }
    }
}