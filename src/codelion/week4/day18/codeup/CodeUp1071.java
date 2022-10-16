package codelion.week4.day18.codeup;

import java.util.Scanner;

public class CodeUp1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (input != 0) {
            if (input == 0) {
                break;
            }
            System.out.println(input);
            input = sc.nextInt();
        }
    }
}
