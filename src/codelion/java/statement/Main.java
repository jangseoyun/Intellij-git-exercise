package codelion.java.statement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        EvenOdd english = new EvenOdd(first, second, new EnglishStatementMakerImpl());
        english.createWord();

        EvenOdd korean = new EvenOdd(first, second, new KoreanStatementMakerImpl());
        korean.createWord();
    }
}
