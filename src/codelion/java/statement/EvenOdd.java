package codelion.java.statement;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd {
    //입력받은 값 홀수, 짝수 선별 및 언어 생성을 위해 값을 전달하는 역할
    private String result;
    private List<Integer> inputNums = new ArrayList<>();
    private List<String> checkResultObj = new ArrayList<>();
    private CalculateTranslation calculateTranslation;

    public EvenOdd(int first, int second, CalculateTranslation calculateTranslation) {
        this.inputNums.add(first);
        this.inputNums.add(second);
        this.inputNums.add(first + second);
        this.calculateTranslation = calculateTranslation;
    }

    //전달
    public void createWord() {
        List<String> resultList = calculateTranslation.createWord(checkNumber());
        print(resultList);
    }

    //입력받은 값 체크 (return: 짝수 true, 홀수 false)
    private List<String> checkNumber() {
        for (Integer inputNum : inputNums) {
            if (inputNum % 2 == 0) {
                this.checkResultObj.add("E");
            } else {
                this.checkResultObj.add("O");
            }
        }
        return checkResultObj;
    }

    private void print(List<String> resultList) {
        System.out.println(resultList.get(0) + "+" + resultList.get(1) + "=" + resultList.get(2));
    }

}
