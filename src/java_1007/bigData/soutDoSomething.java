package java_1007.bigData;

import java.util.List;
//List<T>를 리턴하는 인터페이스를 설계
//T가 PopulationMove가 될 수도 있고 Patient가 될 수도 있음
//다형성
public class soutDoSomething implements DoSomething<PopulationMove>{

    @Override
    public List<PopulationMove> work(String str) {
        return null;
    }
}
