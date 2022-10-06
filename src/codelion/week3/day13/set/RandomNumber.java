package codelion.week3.day13.set;

import java.util.HashSet;
import java.util.Set;

public class RandomNumber {
    private Set<Integer> fiftyNum;

    public RandomNumber() {
        this.fiftyNum = new HashSet<>();
    }

    public Set<Integer> setNumber(int num) {

        for (int i = 0; i < 50; i++) {
            fiftyNum.add(num);
        }

        return fiftyNum;
    }
}
