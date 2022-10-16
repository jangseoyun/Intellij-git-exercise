package codelion.week4.day18.codeup;

import java.util.Scanner;

public class CodeUp1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int tmp = 0;
        for (int i = 1; i <= input; i++) {
            if ((i % 2) == 0) {
                tmp += i;
            }
        }

        System.out.println(tmp);
    }
}
