package codelion.week5.day20.algorithm;

import java.util.Scanner;

public class Algorithm01 {

    public void printSquareMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Algorithm01 T = new Algorithm01();
        T.printSquareMatrix(input);
    }
}
