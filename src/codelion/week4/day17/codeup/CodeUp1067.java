package codelion.week4.day17.codeup;

import java.util.Scanner;

public class CodeUp1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();

        if (input < 0) {
            System.out.println("minus");
        } else {
            System.out.println("plus");
        }

        if ((input % 2) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
