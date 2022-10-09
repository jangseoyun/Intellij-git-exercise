package codelion.week3.day14.context.context;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLineContext<T> {
    private Parser<T> parser;

    public ReadLineContext(Parser<T> parser) {
        this.parser = parser;
    }

    public List<T> readByLine(String filename) throws IOException {//한줄씩 읽는 기능
        List<T> result = new ArrayList<>();
        BufferedReader br = new BufferedReader(
                new FileReader(filename)
        );

        String str;
        while ((str = br.readLine()) != null) {
            //System.out.println(str);
            result.add(parser.parse(str));
        }

        br.close();
        return result;
    }
}
