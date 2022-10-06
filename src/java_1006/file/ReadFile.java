package java_1006.file;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadFile {
    private String filePath;
    private int byteSize;
    private int lineSize;

    public ReadFile(String filePath, int byteSize, int lineSize) {
        this.filePath = filePath;
        this.byteSize = byteSize;
        this.lineSize = lineSize;
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

        BufferedReader bufferedReader = new BufferedReader( new FileReader(filePath) );

        for(int i=0; i<2; i++){
            System.out.print((char)bufferedReader.read());
        }
    }

    //n바이트씩 읽는 메서드
    public void readNByte() throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new FileReader(filePath) );

        for(int i=0; i<byteSize; i++){
            System.out.print((char)bufferedReader.read());
        }
    }

    public void readLine() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line = br.readLine();
        System.out.println(line);
    }

    public void readNLine() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filePath));
//        String line = br.readLine();
        for(int i=0; i < lineSize; i++){
            System.out.println(br.readLine());
        }
    }

}
