package codelion.week3.day12.statement;

import java.util.List;

public class KoreanStatementMakerImpl implements CalculateTranslation {

    @Override
    public List<String> createWord(List<String> getResultObj) {
        for (int i = 0; i < getResultObj.size(); i++) {
            if (getResultObj.get(i).equals("E")) {
                getResultObj.set(i, "짝수");
            }else {
                getResultObj.set(i, "홀수");
            }
        }
        return getResultObj;
    }
}
