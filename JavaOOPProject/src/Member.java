import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Member extends User{
    private String name; //รูปแบบเป็นชื่อ-นามสกุล Ex.Kudo-Shinichi
    private int points; //5 B. = 1 point, 1 points = 1 B.

    public Member(String username, String password, String name, int points){
        super(username, password);
        this.name = name;
        this.points = points;
    }

    public void addPoint(int amount){
        points += amount;
    }

    public void usePoint(int point){
        points -= point;
    }

    public int getPoint(){
        return points;
    }

    public void updateInfo(String phone, int newPoints) throws IOException {
        Scanner reader = new Scanner(new File("user.txt"));
        String newData = "";
        boolean flag = false;

        while (reader.hasNext()){
            String Line = reader.nextLine();
            String[] data = Line.split(",");
            if(data.length >= 4 && data[0].trim().equals(phone)){
                Line = data[0].trim() + "," + data[1].trim() + "," + data[2].trim() + "," + String.valueOf(newPoints);
                flag = true;
            }
            newData += Line + "\n";
        }

        reader.close();

        if(flag){
            PrintWriter writer = new PrintWriter("user.txt");
            writer.print(newData);
            writer.close();
        }
    }

    public void setPoints(int points){
        this.points = points;
    }

    @Override
    public String displayInfo() {
        return "Name: " + name + "\n" +
                "Phone number: " + getUsername() + "\n" +
                "Point: " + getPoint();
    }

    public void registerMember(String username, String password, String name) throws IOException{
        name = name.trim().replace(" ", "-");

        PrintWriter writer = new PrintWriter(new FileWriter("user.txt", true));
        writer.println(username + "," + password + "," + name + "," + 0);
        writer.close();
    }

    public Member isExistingMember(String username) throws IOException{
        Scanner reader = new Scanner(new File("user.txt"));
        while (reader.hasNext()){
            String[] data = reader.nextLine().split(",");
            if (username.equals(data[0])){
                reader.close();
                String phone = data[0].trim();
                String password = data[1].trim();
                String name = data[2].trim();
                int point = Integer.parseInt(data[3].trim());
                return new Member(phone, password, name, point);
            }
        }
        reader.close();
        return null;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    public int getPoints() {
        return points;
    }
}
