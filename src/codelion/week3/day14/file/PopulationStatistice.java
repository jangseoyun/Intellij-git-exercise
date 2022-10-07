package codelion.week3.day14.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PopulationStatistice {
    public void readByLine2(String filename) {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8
        )) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                parse(line);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public void readByChar(String filename) throws IOException {//1byte 읽는 기능
        FileReader fileReader = new FileReader(filename);

        String fileContents = "";
        while (fileContents.length() < 1_000_000) {
            char c = (char) fileReader.read();
            fileContents += c;
        }

        System.out.println(fileContents);
    }

    public List<PopulationMove> readByLine(String filename) throws IOException {//한줄씩 읽는 기능
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader br = new BufferedReader(
                new FileReader(filename)
        );

        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
            PopulationMove pm = parse(str);
            pml.add(pm);
        }

        br.close();
        return pml;
    }

    public PopulationMove parse(String data) {//한줄 읽어와서 PopulationMove 인스턴스
        String[] splitLine = data.split(",");
        Integer fromSido = Integer.valueOf(splitLine[0]);//0번 전입 , 6번 전출
        Integer toSido = Integer.valueOf(splitLine[6]);
        return new PopulationMove(fromSido, toSido);
    }

    public static void main(String[] args) throws IOException {
        String address = "/Users/seoyun/codeLion/2021_인구관련연간자료_20221007_32002.csv";
        PopulationStatistice ps = new PopulationStatistice();
        List<PopulationMove> pml = ps.readByLine(address);
        System.out.println(pml.size());
    }
}