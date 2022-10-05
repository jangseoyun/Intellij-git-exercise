package codelion.java.week3;

public class RandomCalculator {

    private int input;
    private RandomMachine randomMachine;

    public RandomCalculator(int input) {
        this.input = input;
    }

    public void plus() {
        System.out.println(input + new RandomMachine().randomNum());
    }

    public void minus() {
        System.out.println(input - new RandomMachine().randomNum());
    }

    public void multiple() {
        System.out.println(input * new RandomMachine().randomNum());
    }

    public void divide() {
        try {
            System.out.println((float) input / new RandomMachine().randomNum());
        } catch (ArithmeticException e) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다");
        }

    }


}
