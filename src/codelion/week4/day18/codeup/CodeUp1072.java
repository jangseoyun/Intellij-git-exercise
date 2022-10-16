package codelion.week4.day18.codeup;

import java.util.Scanner;

public class CodeUp1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[sc.nextInt()];

        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
            System.out.println(input[i]);
        }
    }
}
