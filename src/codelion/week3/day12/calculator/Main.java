package codelion.week3.day12.calculator;

public class Main {
    public static void main(String[] args) {
        NumberGenerator RandomNumberGenerator = new RandomNumberGenerator();
        Calculator randomNumberCalculator = new Calculator(RandomNumberGenerator);
        randomNumberCalculator.plus(30);

        Calculator specificNumberGenerator = new Calculator(new SpecificNumberGenerator(), 200);
        specificNumberGenerator.plus(50);
    }
}
