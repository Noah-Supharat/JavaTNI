import javax.swing.*;

public class Lab402 {
    public static void main(String[] args) {
        String id =  JOptionPane.showInputDialog(null,"Enter student-id:");
        String major;
        while(id.length() != 10){
            id =  JOptionPane.showInputDialog(null,"Enter student-id:");
        }
        String majorIdNumber = id.substring(2,5);
        System.out.println(majorIdNumber);

        if (majorIdNumber.equals("131")) {
            major = "Information Technology (IT)";
        }
        else if(majorIdNumber.equals("132")){
            major = "Multimedia Technology (MT)";
        }
        else if(majorIdNumber.equals("133")){
            major = "Digital Business Information Technology (BI)";
        }
        else if(majorIdNumber.equals("134")){
            major = "Digital Technology in Mass Technology (DC)";
        }
        else if(majorIdNumber.equals("135")){
            major = "Data Science and Data Analytics (DS)";
        }
        else{
            major = "Cannot found major";
        }

        JOptionPane.showMessageDialog(null,"Student ID: " + id + "\nMajor: " + major);
    }
}
