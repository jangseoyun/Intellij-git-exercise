package codelion.week3.day13.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] split = input.split("\\.");

        System.out.printf("%02d-%02d-%04d", Integer.valueOf(split[2]), Integer.valueOf(split[1]), Integer.valueOf(split[0]));
    }
}
