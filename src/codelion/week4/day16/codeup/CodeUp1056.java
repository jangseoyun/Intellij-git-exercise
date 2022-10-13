package codelion.week4.day16.codeup;

import java.util.Scanner;

public class CodeUp1056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aInt = sc.nextInt();
        int bInt = sc.nextInt();

        int result = 0;
        if (aInt != bInt) {
            result = 1;
        }
        System.out.println(result);
        sc.close();
    }
}
