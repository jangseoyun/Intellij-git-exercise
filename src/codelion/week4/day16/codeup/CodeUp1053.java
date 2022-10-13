package codelion.week4.day16.codeup;

import java.util.Scanner;

public class CodeUp1053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int result = 0;
        if (input == 0) {
            result = 1;
        }

        System.out.println(result);
        sc.close();
    }
}
