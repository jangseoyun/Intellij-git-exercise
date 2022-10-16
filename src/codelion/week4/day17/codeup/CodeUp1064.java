package codelion.week4.day17.codeup;

import java.util.Scanner;

public class CodeUp1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int result = input[0];

        for (int i = 1; i < input.length; i++) {
            int set = (result > input[i]) ? result = input[i] : result;
        }

        System.out.println(result);

    }
}
