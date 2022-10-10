package codelion.week3.day14.context.domain.parser;

import codelion.week3.day14.context.context.Parser;
import codelion.week3.day14.context.vo.PopulationMoveVo;

public class PopulationMoveParser implements Parser<PopulationMoveVo> {
    @Override
    public PopulationMoveVo parse(String str) {
        String[] splittedLine = str.split(",");
        int fromSido = Integer.parseInt(splittedLine[0]);
        int toSido = Integer.parseInt(splittedLine[1]);
        return new PopulationMoveVo(fromSido, toSido);
    }

    /*@Override
    public PopulationMoveVo parse(String str) {
        String[] splittedLine = str.split(",");
        return new PopulationMoveVo(splittedLine[6], splittedLine[0]);//전입, 전출
    }*/
}
