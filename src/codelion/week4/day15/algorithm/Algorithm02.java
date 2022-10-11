package codelion.week4.day15.algorithm;

import java.util.Scanner;

public class Algorithm02 {
    public int solution(int input) {
        int result = 0;
        while (input > 0) {
            input = input / 10;
            result++;
        }
        return result;
    }
    public static void main(String[] args) {
        Algorithm02 T = new Algorithm02();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(T.solution(input));
    }
}
