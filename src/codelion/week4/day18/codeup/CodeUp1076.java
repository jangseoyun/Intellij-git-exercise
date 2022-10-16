package codelion.week4.day18.codeup;

import java.util.Scanner;

public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        for (char i = 'a'; i <= input; i++) {
            System.out.print(i + " ");
        }
    }
}
