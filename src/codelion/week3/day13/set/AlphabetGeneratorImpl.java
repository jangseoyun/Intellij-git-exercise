package codelion.week3.day13.set;

public class AlphabetGeneratorImpl implements AlphabetGenerator {

    @Override
    public int generate() {
        return (char)((int)(Math.random()*26)+65);
    }
}
