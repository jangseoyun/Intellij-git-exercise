package codelion.week3.day13.codeup;

import java.util.Scanner;

public class Algorithm06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] inputSplit = input.split(":");
        for (int i = 0; i < inputSplit.length; i++) {
            if (inputSplit[i].equals("00")) {
                inputSplit[i] = "0";
            }
        }

        System.out.println(inputSplit[1]);
    }
}
