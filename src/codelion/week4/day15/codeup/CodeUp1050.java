package codelion.week4.day15.codeup;

import java.util.Scanner;

public class CodeUp1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int result = (first == second) ? 1 : 0;
        System.out.println(result);
    }
}
