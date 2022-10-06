package codelion.week3.day13.codeup;

import java.util.Scanner;

public class Algorithm05 {
    public static void main(String[] args) {
        int[] intArr = new int[5];
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        intArr[4] = (input % 10);
        int tmp = input;

        for (int i = 3; i >= 0; i--) {
            tmp = (tmp / 10);
            intArr[i] = (tmp % 10);
        }

        System.out.printf("[%d0000]\n[%d000]\n[%d00]\n[%d0]\n[%d]", intArr[0], intArr[1], intArr[2], intArr[3], intArr[4]);

    }
}