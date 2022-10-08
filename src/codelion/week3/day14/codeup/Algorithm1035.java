package codelion.week3.day14.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm1035 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Integer hex = Integer.valueOf(input, 16);
        String result = Integer.toOctalString(hex);
        System.out.println(result);
    }
}
