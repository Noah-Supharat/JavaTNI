package Banking;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OpenNewAccount extends BankAccount{
    public OpenNewAccount(String accId, double accBalance){
        super(accId, accBalance);
    }

    public String recordAccount() throws IOException{
        FileWriter filename = new FileWriter(getFilename(), true);
        PrintWriter writer = new PrintWriter(filename);

        if(isExistingAccount(getAccId())){
            writer.close();
            return "This account has been created!!";
        }

        writer.println(toString());

        writer.close();

        return "Created account success!!";
    }

    private boolean isExistingAccount(String account_name) throws IOException {
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
}
