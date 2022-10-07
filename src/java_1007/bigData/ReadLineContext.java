package java_1007.bigData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLineContext<T> {

    DoSomething<T> doSomething;

    public List<T> readByLine(String filename) throws IOException {

        List<T> result = new ArrayList<>();
        BufferedReader br = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while((str = br.readLine())!= null){
            System.out.println(str);
//            PopulationMove pm = parse(str);
        }
        br.close();
        return result;
    }
}
