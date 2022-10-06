package codelion.week3.day13.codeup;

import java.util.Scanner;

public class Algorithm01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String answer = "";

        try {
            char[] chars = input.toCharArray();
            for (char ch : chars) {
                answer += ch;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("단어의 길이는 50자 이하여야 합니다.");
        }

        System.out.println(answer);

    }

}
