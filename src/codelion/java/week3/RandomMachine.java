package codelion.java.week3;

import java.util.Random;

public class RandomMachine {
    public int randomNum() {
        Random random = new Random();
        return random.nextInt(9);
    }
}
