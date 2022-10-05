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
        //0은 randomMachine에서 처리
        System.out.println((float) input / randomMachine.randomNum());
    }


}
