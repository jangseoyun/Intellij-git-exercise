package codelion.week3.day13.set;

import codelion.week3.day12.calculator.RandomNumberGenerator;

import java.util.HashSet;
import java.util.Set;

public class RanNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Integer> setNumber = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            int r = randomNumberGenerator.generate(10);//10미만의 숫자 생성
            setNumber.add(r);
            System.out.println(r);
        }
        System.out.println(setNumber);

    }
}
