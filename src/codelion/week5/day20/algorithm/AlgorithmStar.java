package codelion.week5.day20.algorithm;

import java.util.Scanner;

public class AlgorithmStar {
    public void printStar(int n, String now) {
        if (n < now.length()) {
            return;
        }
        System.out.print(now + "\n");
        printStar(n, now + "*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        new AlgorithmStar().printStar(input, "*");
    }
}
