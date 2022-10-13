package codelion.week4.day16.codeup;

import java.util.Scanner;

public class CodeUp1055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aInt = sc.nextInt();
        int bInt = sc.nextInt();

        int result = 0;
        if (aInt == 1 || bInt == 1) {
            result = 1;
        }
        System.out.println(result);
        sc.close();
    }
}
