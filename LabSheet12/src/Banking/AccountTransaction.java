package Banking;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AccountTransaction extends BankAccount implements Transactionable{
    public AccountTransaction(String accId){
        super(accId);
    }

    public boolean hasAccountId() throws IOException {
        File filePath = new File(getFilename());
        Scanner scanner = new Scanner(filePath);

        while(scanner.hasNext()){
            String[] data = scanner.nextLine().split(",");
            String accountId = data[0];
            if(accountId.equals(super.getAccId())){
                return true;
            }
        }

        scanner.close();

        return false;
    }

    @Override
    public void deposit(double amount) {
        setAccBalance(getAccBalance() + amount);
    }

    @Override
    public void withdraw(double amount){
        if(checkBalance() >= amount){
            setAccBalance(getAccBalance() - amount);
        }
    }

    @Override
    public double checkBalance() {
        return getAccBalance();
    }
}
