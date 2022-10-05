package codelion.java.calculator;

public class Main {
    public static void main(String[] args) {
        NumberGenerator RandomNumberGenerator = new NumberGeneratorImpl();
        Calculator calculator = new Calculator(RandomNumberGenerator);
        calculator.plus();

        Calculator specificNumberGenerator = new Calculator(new SpecificNumberGenerator());
        specificNumberGenerator.plus();
    }
}
