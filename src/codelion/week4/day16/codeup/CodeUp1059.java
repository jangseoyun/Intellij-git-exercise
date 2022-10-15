package codelion.week4.day16.codeup;

import java.util.Scanner;

public class CodeUp1059 {
    public static void main(String[] args) {//TODO :
        Scanner sc = new Scanner(System.in);
        int aInt = sc.nextInt();
        String bit = String.format("%d", ~aInt);

        Integer result = Integer.valueOf(bit);
        System.out.println(result);
    }
}
