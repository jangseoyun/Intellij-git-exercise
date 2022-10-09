package codelion.week3.day14.context.parser;

import codelion.week3.day14.context.context.Parser;
import codelion.week3.day14.context.domain.PatientVo;

public class PatientParser implements Parser<PatientVo> {
    @Override
    public PatientVo parse(String str) {
        String[] splittedLine = str.split(",");
        return new PatientVo(splittedLine[0], splittedLine[1], Float.parseFloat(splittedLine[2]));
    }
}
