package codelion.week3.day14.file;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            //System.out.println(str);
            PopulationMove pm = parse(str);
            pml.add(pm);
        }

        br.close();
        return pml;
    }

    public PopulationMove parse(String data) {//한줄 읽어와서 PopulationMove 인스턴스
        String[] splitLine = data.split(",");
        Integer fromSido = Integer.valueOf(splitLine[0]);//0번 전입 , 6번 전출
        Integer toSido = Integer.valueOf(splitLine[1]);
        return new PopulationMove(fromSido, toSido);//from, to
    }

    public void createAFile(String filename) {
        File file = new File(filename);

        try {
            file.createNewFile();//이때 파일이 생성되는 것
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // List<String>을 지정한 파일에 write
    public void write(List<String> strs, String filename) {
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String str : strs) {
                writer.write(str);
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
    }

    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {
        Map<String, Integer> moveCntMap = new HashMap<>();
        for (PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if (moveCntMap.get(key) == null) {
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }

        return moveCntMap;
    }

    public static void main(String[] args) throws IOException {
        String address = "./from_to.txt";
        PopulationStatistice ps = new PopulationStatistice();
        List<PopulationMove> pml = ps.readByLine(address);//파일 읽어온뒤 객체로 만들어서 리스트에 담기

        Map<String, Integer> moveCntMap = ps.getMoveCntMap(pml);
        String targetName = "each_sido_cnt.txt";
        ps.createAFile(targetName);

        List<String> cntResult = new ArrayList<>();
        for (String key : moveCntMap.keySet()) {
            String[] fromTo = key.split(",");
            String s = String.format("[%s, %s, %d]\n", fromTo[0], fromTo[1], moveCntMap.get(key));
            cntResult.add(s);
            //System.out.printf("key:%s value:%d\n", key, moveCntMap.get(key));
        }

        ps.write(cntResult, targetName);

    }
}
