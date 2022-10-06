package java_1006.file;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadFile {
    private String fileName;

    public ReadFile(String fileName) {
        this.fileName = fileName;
    }

    public void findDir(){
        File dir = new File("./");
        File files[] = dir.listFiles();
        for(File file : files){
            System.out.println(file);
//              .\.git
//              .\.gitignore
//              .\.idea
//              .\a_file.txt
//              .\java-project-push-exercise.iml
//              .\out
//              .\src
        }
    }
    //두바이트씩 읽는 메서드
    public void readTwoByte() throws IOException {
        String filePath = "./" + fileName + ".txt";
        BufferedReader bufferedReader = new BufferedReader( new FileReader(filePath) );

        for(int i=0; i<2; i++){
            System.out.print((char)bufferedReader.read());
        }
    }

    //n바이트씩 읽는 메서드
    public void readNByte(int byteSize) throws IOException {
        String filePath = "./" + fileName + ".txt";
        BufferedReader bufferedReader = new BufferedReader( new FileReader(filePath) );

        for(int i=0; i<byteSize; i++){
            System.out.print((char)bufferedReader.read());
        }
    }

}
