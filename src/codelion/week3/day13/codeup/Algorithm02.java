package codelion.week3.day13.codeup;

import java.util.Scanner;

public class Algorithm02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        char[] inputChars = inputStr.toCharArray();

        if (inputChars.length > 2000) {
            System.out.println("공백 포함 최대 길이는 2000 문자를 넘기 않는다.");
        }

        System.out.println(inputChars);
    }
}
