package codelion.week4.day18.codeup;

import java.util.Scanner;

public class CodeUp1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char input = sc.next().charAt(0);
            if (input == 'q') {
                System.out.println('q');
                break;
            }
            System.out.println(input);
        }
    }
}
