package codelion.week5.day20.algorithm;

import java.util.Scanner;

public class AlgorithmRectangle {
    public void printRectangle(int x, int y) {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        AlgorithmRectangle T = new AlgorithmRectangle();
        T.printRectangle(x,y);
    }
}
