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

        return result;
    }
}
