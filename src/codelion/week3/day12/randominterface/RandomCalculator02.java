package codelion.week3.day12.randominterface;

public class RandomCalculator02 {

    private int input;
    private RandomMachine randomMachine;

    public RandomCalculator02(int input) {
        this.input = input;
        this.randomMachine = new RandomMachineImpl();
    }

    public void plus() {
        System.out.println(input + randomMachine.randomMachine());
    }

    public void minus() {
        System.out.println(input - randomMachine.randomMachine());
    }

    public void multiple() {
        System.out.println(input * randomMachine.randomMachine());
    }

    public void divide() {

        try {
            System.out.println((float) input / randomMachine.randomMachine());
        } catch (ArithmeticException e) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다");
        }

    }


}
