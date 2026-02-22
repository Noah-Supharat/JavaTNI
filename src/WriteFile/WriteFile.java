package WriteFile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        FileWriter filename = new FileWriter("src/WriteFile/user2.txt", true);
        PrintWriter writer = new PrintWriter(filename);

        writer.println("Java");

        writer.close();
    }
}