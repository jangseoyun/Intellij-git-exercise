package codelion.week4.day16.codeup;

import java.util.Scanner;

public class CodeUp1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aInt = sc.nextInt();
        int bInt = sc.nextInt();

        int result = (aInt == 0 && bInt == 0) ? 1 : 0;
        System.out.println(result);
        sc.close();
    }
}
