import java.io.File;
import java.io.IOException; //ครอบคลุมการทำงานกับไฟล์
import java.util.Scanner;

public class ReadFile {
    public static String hide_password(String password){
        String hide_password = "";
        for (int i = 0; i < password.length(); i++){
            if(i == 0) hide_password += password.charAt(i);
            else if (i == password.length()-1) hide_password += password.charAt(i);
            else hide_password += "*";
        }
        return hide_password;
    }

    public static void main(String[] args) throws IOException {
        File filePath = new File("src/users-0078.txt");
        Scanner scanner = new Scanner(filePath);

        while(scanner.hasNext()){ //.hasNext() ไม่เก็บข้อมูล แค่เช็คเฉยๆว่ามีข้อมูลมั้ย
            String[] data = scanner.nextLine().split(",");
            String username = data[0];
            String password = data[1];
            String gender = data[2];
            int birthYear = Integer.parseInt(data[3]);
            System.out.println("Username   = " + username);
            System.out.println("Password   = " + hide_password(password));
            System.out.println("Gender     = " + gender);
            System.out.println("Birth year = " + birthYear);
            System.out.println();
        }

        scanner.close();
    }
}
