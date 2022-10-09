package codelion.week3.day14.file;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //readListContext를 생성할 때 type을 넣어서 생성을 합니다.
        //readListContext를 new할 때 파싱로직(DoSomething)의 구현체를 넣어서 생성한다.
        ReadLineContext<PopulationMove> readLineContext = new ReadLineContext<>();
        List<PopulationMove> result = readLineContext.readByLine("");
    }
}
