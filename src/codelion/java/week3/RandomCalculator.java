package codelion.java.week3;

public class RandomCalculator {

    private int input;
    private RandomMachine randomMachine;

    public RandomCalculator(int input) {
        this.input = input;
        this.randomMachine = new RandomMachine();
    }

    public void plus() {
        System.out.println(input + randomMachine.randomNum());
    }

    public void minus() {
        System.out.println(input - randomMachine.randomNum());
    }

    public void multiple() {
        System.out.println(input * randomMachine.randomNum());
    }

    public void divide() {

        if (randomMachine.randomNum() == 0) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다");
        }

        System.out.println(input / randomMachine.randomNum());
    }


}
