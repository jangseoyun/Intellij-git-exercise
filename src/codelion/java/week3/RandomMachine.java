package codelion.java.week3;

import java.util.Random;

public class RandomMachine {

    private int randomNum;

    public RandomMachine() {
        this.randomNum = randomNum();
    }

    public int randomNum() {
        Random random = new Random();
        int result = random.nextInt(9);

        if (result == 0) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다");
        }

        return result;
    }
}
