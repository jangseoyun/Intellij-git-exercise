package codelion.java.statement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        EvenOdd evenOdd = new EvenOdd(first, second, new EnglishStatementMakerImpl());
        evenOdd.createWord();
        System.out.println();
    }
}
