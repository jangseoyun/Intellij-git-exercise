package codelion.java.randominterface;

import java.util.Scanner;

public class RandomCalculatorMain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RandomCalculator02 randomCalculator = new RandomCalculator02(sc.nextInt());

        randomCalculator.plus();
        randomCalculator.minus();
        randomCalculator.multiple();
        randomCalculator.divide();
    }
}
