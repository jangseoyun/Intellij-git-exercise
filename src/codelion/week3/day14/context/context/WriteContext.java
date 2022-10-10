package codelion.week3.day14.context.context;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteContext {

    private File file;
    private String result;

    public WriteContext(String filename) {
        this.file = new File(filename);
    }

    public String write(List<String> strs, String filename) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String str : strs) {
                writer.write(str);
                result = "성공";
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            result = "실패";
        }

        return result;
    }

    public String createAFile(String filename) {

        try {
            file.createNewFile();//이때 파일이 생성되는 것
            result = "파일 생성 성공";
        } catch (IOException e) {
            result = "파일 생성 실패";
            throw new RuntimeException(e);
        }
        return result;
    }
}
