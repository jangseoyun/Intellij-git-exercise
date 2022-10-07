package codelion.week3.day13.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {

    private String filename;

    public ReadFile(String filename) {
        this.filename = filename;
    }

    public char readAByte(String filename) {
        try (BufferedReader br = Files.newBufferedReader(//buffer로 파일 읽기
                Paths.get("a_file.txt"), StandardCharsets.UTF_8)) {//파일 경로에 관한 정보 가져오기,
            return (char) br.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readTwoWord(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();
        return str;
    }

    public String readLine(String filename) {
        try (BufferedReader br = Files.newBufferedReader(//buffer로 파일 읽기
                Paths.get("a_file.txt"), StandardCharsets.UTF_8)) {//파일 경로에 관한 정보 가져오기,
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws IOException{
        ReadFile readFile = new ReadFile("a_file.txt");//읽을 파일명 변수에 저장

        char c = readFile.readAByte("./a_file.txt");//메서드 호출 -> 한 바이트 가져오기
        System.out.println(c);

        String str = readFile.readLine("./a_file.txt");
        System.out.println(str);

        String ch2 = readFile.readTwoWord("./a_file.txt");
        System.out.println(ch2);
    }
}

