package codelion.week3.day13.codeup;

import java.util.Scanner;

public class Algorithm09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        String result = String.format("%.11f", input);
        System.out.println(result);
    }
}
