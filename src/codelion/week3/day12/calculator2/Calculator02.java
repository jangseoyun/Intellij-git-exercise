package codelion.week3.day12.calculator2;

public class Calculator02 {
    private NumberCreator numberCreator;
    private int baseNum;

    public Calculator02(NumberCreator numberCreator) {
        this.numberCreator = numberCreator;
        this.baseNum = 10;
    }

    public Calculator02(NumberCreator numberCreator, int baseNum) {
        this.numberCreator = numberCreator;
        this.baseNum = baseNum;
    }

    public void plus(int num) {
        System.out.println(num + numberCreator.create(baseNum));
    }
}
