package codelion.java.codeup;

import java.util.Scanner;

public class Quiz1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] splitInput = input.split("-");
        for (String s : splitInput) {
            System.out.print(s);
        }
    }
}
