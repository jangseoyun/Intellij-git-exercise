package codelion.week3.day13.set;

import codelion.week3.day12.calculator.RandomNumberGenerator;

public class RanNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        RandomNumber randomNumber = new RandomNumber();
        for (int i = 0; i < 50; i++) {
            int r = randomNumberGenerator.generate(10);//10미만의 숫자 생성
            System.out.println(r);
            randomNumber.setNumber(r);
        }

    }
}
