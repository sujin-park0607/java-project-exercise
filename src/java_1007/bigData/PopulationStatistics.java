package java_1007.bigData;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class PopulationStatistics {
    public void radByChar(String filname) throws IOException{
        FileReader fr = new FileReader(filname);

        String fileContents = "";
        while(fileContents.length() < 1_000_000){
            char c = (char)fr.read();
            fileContents += c;
            System.out.println(fileContents);
        }
        System.out.println(fileContents);
    }

    //while문 안에서 string을 PopulationMove로 parsing 하여 pml에 add합니다.
    //루프가 끝나면 return 합니다.
    public List<PopulationMove> readByLine(String filename) throws IOException{

        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader br = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while((str = br.readLine())!= null){
//            System.out.println(str);
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        br.close();
        return pml;
    }

    public void readByLine2(String filename) throws IOException{
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)){

            String line;
            while((line = br.readLine())!= null){
                System.out.println(line);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public PopulationMove parse(String data){
        String[] datas = data.split(",");
        return new PopulationMove(Integer.parseInt(datas[0]), Integer.parseInt(datas[1])); //전입to 전출from
    }

    public void createAFile(String fileName){
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //List<Strin>을 저장한 파일 만들기
    public void fileWrite(List<String> strs, String filename) throws IOException {
        File file = new File(filename);

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (String str : strs) {
            writer.write(str);
        }
        writer.close();
    }

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido() + "," + populationMove.getToSido()+"\n";
    }

    public HashMap<String, Integer> getMoveCntMap(List<PopulationMove> pml){
        HashMap<String, Integer> moveCntMap = new HashMap<>();
        for (PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if(moveCntMap.get(key) == null){
                moveCntMap.put(key,1);
            }else{
                moveCntMap.put(key, moveCntMap.get(key)+1);
            }
        }
        return moveCntMap;
    }

    public static void main(String[] args) throws IOException {
        PopulationStatistics ps = new PopulationStatistics();
        String fileName = "./from_to.txt";
        List<PopulationMove> pml = ps.readByLine(fileName);

        Map<String,Integer> map = ps.getMoveCntMap(pml);
        String targetFilename = "each_side_cnt.txt";
        ps.createAFile(targetFilename);
        List<String> cntResult = new ArrayList<>();
        for (String key : map.keySet()) {
            String[] fromto = key.split(",");
            String s = String.format("[%s,%s,%d]\n", fromto[0], fromto[1], map.get(key));
            cntResult.add(s);
        }
        ps.fileWrite(cntResult, targetFilename);

    }
}
