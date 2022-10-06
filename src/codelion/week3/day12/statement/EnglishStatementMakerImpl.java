package codelion.week3.day12.statement;

import java.util.List;

public class EnglishStatementMakerImpl implements CalculateTranslation {
    //even-odd에서 받은 값을 구현체에 맞게 언어 return
    @Override
    public List<String> createWord(List<String> getResultObj) {
        for (int i = 0; i < getResultObj.size(); i++) {
            if (getResultObj.get(i).equals("E")) {
                getResultObj.set(i, "even");
            }else {
                getResultObj.set(i, "odd");
            }
        }
        return getResultObj;
    }


}
