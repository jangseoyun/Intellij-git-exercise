package codelion.week3.day13.codeup;

import java.util.Scanner;

public class Algorithm04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] chars = input.toCharArray();
        for (char ch : chars) {
            System.out.println("\'" + ch + "\'");
        }
    }
}
