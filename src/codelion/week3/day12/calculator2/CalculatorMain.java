package codelion.week3.day12.calculator2;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator02 calculator = new Calculator02(new ByPassNumberCreator());
        calculator.plus(10);

        Calculator02 calculator02 = new Calculator02(new ByPassNumberCreator(), 20);
        calculator02.plus(10);
    }
}
