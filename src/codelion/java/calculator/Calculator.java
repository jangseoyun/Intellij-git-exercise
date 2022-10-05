package codelion.java.calculator;

public class Calculator {
    //NumberCreator에서 만들어준 숫자를 가지고
    //사칙 연산한 결과를 출력한다

    private int baseNum = 10;
    private NumberGenerator numberGenerator;

    public Calculator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public Calculator(NumberGenerator numberGenerator, int baseNum) {
        this.baseNum = baseNum;
        this.numberGenerator = numberGenerator;
    }

    public void plus(int num) {
        int result = num + this.numberGenerator.generate(baseNum);
        System.out.println(result);
    }

}
