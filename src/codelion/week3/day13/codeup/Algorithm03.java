package codelion.week3.day13.codeup;

import java.util.Scanner;

public class Algorithm03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        String[] strings = String.valueOf(input).split("\\.");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
