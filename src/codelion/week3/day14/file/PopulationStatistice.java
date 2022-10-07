package codelion.week3.day14.file;

import java.io.FileReader;
import java.io.IOException;

public class PopulationStatistice {
    public void readFileByLine() {

    }
    public static void main(String[] args) throws IOException {
        String address = "/Users/seoyun/codeLion/2021_인구관련연간자료_20221007_32002.csv";
        FileReader fileReader = new FileReader(address);

        String fileContents = "";
        while (fileContents.length() < 1_000_000) {
            char c = (char) fileReader.read();
            fileContents += c;
        }

        System.out.println(fileContents);
    }
}
