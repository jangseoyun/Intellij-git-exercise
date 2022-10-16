package codelion.week4.day17.codeup;

import java.util.Scanner;

public class CodeUp1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        for (int i : input) {
            if ((i % 2) == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
