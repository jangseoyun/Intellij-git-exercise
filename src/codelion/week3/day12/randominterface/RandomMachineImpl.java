package codelion.week3.day12.randominterface;

import java.util.Random;

public class RandomMachineImpl implements RandomMachine {

    private int randomResult;

    public RandomMachineImpl() {
        this.randomResult = randomMachine();
    }

    @Override
    public int randomMachine() {
        Random random = new Random();
        return random.nextInt(9);
    }

}
