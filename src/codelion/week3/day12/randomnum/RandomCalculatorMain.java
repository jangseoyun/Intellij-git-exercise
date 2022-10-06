package codelion.week3.day12.randomnum;

import java.util.Scanner;

public class RandomCalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RandomCalculator randomCalculator = new RandomCalculator(sc.nextInt());
        randomCalculator.plus();
        randomCalculator.minus();
        randomCalculator.multiple();
        randomCalculator.divide();
    }
}
