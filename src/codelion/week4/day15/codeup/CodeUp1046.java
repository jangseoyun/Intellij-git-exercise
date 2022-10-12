package codelion.week4.day15.codeup;

import java.util.Scanner;

public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
        float ave = (float) sum / arr.length;
        System.out.println(String.format("%.1f", ave));
    }
}
