package java_1006.file;


import java.io.IOException;

public class ReadfileMain {
    public static void main(String[] args) throws IOException {
        String fileName = "a_file";
        String filePath = "./" + fileName + ".txt";
        ReadFile readFile = new ReadFile(filePath, 5, 2);
//        readFile.findDir();
//        readFile.readTwoByte(); //두바이트씩 읽는 메서드
//        readFile.readNByte(); //n바이트씩 읽는 메서드
        readFile.readLine();
    }
}
