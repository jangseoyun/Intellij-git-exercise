package codelion.week3.day14.codeup;

import java.util.Scanner;

public class Algorithm1039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] split = input.split(" ");
        Long result = 0L;
        for (int i = 0; i < split.length; i++) {
            result += Long.parseLong(split[i]);
        }
        System.out.println(result);
    }
}
