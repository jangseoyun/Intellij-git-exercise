package codelion.week4.day16.codeup;

import java.util.Scanner;

public class CodeUp1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        int result = 0;
        if (second >= first) {
            result = 1;
        }
        System.out.println(result);
        sc.close();
    }
}
