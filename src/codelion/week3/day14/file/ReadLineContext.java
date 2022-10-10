package codelion.week3.day14.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLineContext<T> {

    DoSomething<T> doSomething;

    public List<T> readByLine(String filename) throws IOException {//한줄씩 읽는 기능
        List<T> pmList = new ArrayList<>();
        BufferedReader br = new BufferedReader(
                new FileReader(filename)
        );

        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);//실행되는 부분을 인터페이스로 만들어 준다
        }

        br.close();
        return pmList;
    }
}
