package codelion.week4.day17.codeup;

import java.util.Scanner;

public class CodeUp1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int result = (first > second) ? first : second;
        System.out.println(result);
    }
}
