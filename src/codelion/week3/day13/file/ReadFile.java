package codelion.week3.day13.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {

    private String filename;

    public ReadFile(String filename) {
        this.filename = filename;
    }

    char readAByte(String filename) {
        try (BufferedReader br = Files.newBufferedReader(
            Paths.get("a_file.txt"), StandardCharsets.UTF_8)){
            return (char)br.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile("a_file.txt");
        char c = readFile.readAByte("./a_file.txt");
        System.out.println(c);
    }
}
