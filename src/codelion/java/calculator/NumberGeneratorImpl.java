package codelion.java.calculator;

public class NumberGeneratorImpl implements NumberGenerator{
    @Override
    public int generate(int num) {
        return (int) (Math.random() * 10) + 1;
    }
}
