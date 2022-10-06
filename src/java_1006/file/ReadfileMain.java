package java_1006.file;


import java.io.IOException;

public class ReadfileMain {
    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile("a_file");
        readFile.findDir();
        readFile.readTwoByte(); //두바이트씩 읽는 메서드
        readFile.readNByte(5); //n바이트씩 읽는 메서드

    }
}
