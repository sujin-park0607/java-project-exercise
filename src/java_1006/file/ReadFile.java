package java_1006.file;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("./a_file.txt");

        char ch = (char)reader.read();
        System.out.println(ch);
    }
}
