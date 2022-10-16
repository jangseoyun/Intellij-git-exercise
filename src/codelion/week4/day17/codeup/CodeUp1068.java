package codelion.week4.day17.codeup;

import java.util.Scanner;

public class CodeUp1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int point = sc.nextInt();

        if (point >= 90 && point <= 100) {
            System.out.println("A");
        } else if (point >= 70 && point <= 89) {
            System.out.println("B");
        } else if (point >= 40 && point <= 69) {
            System.out.println("C");
        } else if (point >= 0 && point <= 39) {
            System.out.println("D");
        } else {
            System.out.println("다시 입력해 주세요");
        }
    }
}