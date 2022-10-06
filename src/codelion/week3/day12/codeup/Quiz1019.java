package codelion.week3.day12.codeup;

import java.util.Scanner;

public class Quiz1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] temp = str.split("\\."); //문자열을 "."로 자르면 안 잘린다. "\\."로 자를 것
        System.out.printf("%04d.%02d.%02d", Integer.valueOf(temp[0]), Integer.valueOf(temp[1]), Integer.valueOf(temp[2]));

        sc.close();
    }
}
