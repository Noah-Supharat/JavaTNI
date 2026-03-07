import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class User {
    private String username; //เบอร์โทร(ยกเลิก phone ในคลาส Member ใช้อันนี้อันเดียว)
    private String password; //ถ้าเป็นลูกค้าจะเซ็ตที่ 000000 ในระบบล้อกอินจะไม่อนุญาตผู้ใช้รหัสนี้ด้วย

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password) throws IOException {
        Scanner reader = new Scanner(new File("user.txt"));
        boolean usernameFlag = false;
        boolean passwordFlag = false;

        while (reader.hasNext()){
            String[] data = reader.nextLine().split(",");
            if(getUsername().equals(data[0])){
                usernameFlag = true;
                if((password.equals(data[1])) && !((data[1].equals("000000")))){ //เพราะรหัส 000000 คือลูกค้า
                    passwordFlag = true;
                }
            }
        }

        reader.close();

        return ((usernameFlag) && (passwordFlag)); //ถ้าเป็น true คือ username&password ถูก ให้เข้าระบบได้
    }

    public void logout(){
        username = null; //ไว้ล้างค่า username กันไว้ก่อน เดี๋ยวมันวน จริงๆถ้ารหัสเป็น 000000 อาจจะต้อง logout ด้วย แต่ดูก่อน
    }

    public String displayInfo(){
        return "Username: " + username;
    }

    public String getUsername(){
        return username;
    }
}
