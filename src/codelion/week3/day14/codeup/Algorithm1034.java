package codelion.week3.day14.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm1034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Integer octal = Integer.valueOf(input, 8);
        Integer result = Integer.valueOf(octal);
        System.out.println(result);
    }
}
