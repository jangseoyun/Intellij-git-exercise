package codelion.week3.day14.context.parser;

import codelion.week3.day14.context.context.Parser;
import codelion.week3.day14.context.domain.PopulationMoveVo;

public class PopulationMoveParser implements Parser<PopulationMoveVo> {
    @Override
    public PopulationMoveVo parse(String str) {
        String[] splittedLine = str.split(",");
        return new PopulationMoveVo(splittedLine[6], splittedLine[0]);//전입, 전출
    }
}
