package Banking;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankSystem1 {
    public static String input_account_id(){
        Scanner scanner = new Scanner(System.in);

        String accountId = "";

        while (true){
            System.out.print("Enter account id: ");
            accountId = scanner.next();
            if(accountId.length() == 10){
                break;
            }
        }

        return accountId;
    }

    public static double input_initial_balance(){
        Scanner scanner = new Scanner(System.in);

        double initialBalance;

        while (true){
            System.out.print("Enter your initial amount: ");
            try{
                initialBalance = scanner.nextDouble();
                break;
            }
            catch (InputMismatchException e){
                System.out.print("Try again!! ");
                scanner.nextLine();
            }
        }

        return initialBalance;
    }

    public static void main(String[] args) throws IOException {
        String account_bank = input_account_id();
        System.out.println();
        double initial_balance = input_initial_balance();

        System.out.println();

        OpenNewAccount account = new OpenNewAccount(account_bank, initial_balance);
        //account.recordAccount();
        System.out.println(account.recordAccount());

    }
}
