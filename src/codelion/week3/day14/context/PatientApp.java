package codelion.week3.day14.context;

import codelion.week3.day14.context.context.ReadLineContext;
import codelion.week3.day14.context.vo.PatientVo;
import codelion.week3.day14.context.domain.parser.PatientParser;

import java.io.IOException;
import java.util.List;

public class PatientApp {
    public static void main(String[] args) throws IOException {
        ReadLineContext readLineContext = new ReadLineContext(new PatientParser());
        List<PatientVo> Patients = readLineContext.readByLine("./8842height.phe.txt");
        for (PatientVo patient : Patients) {
            System.out.println(patient.getHeight());
        }
    }
}
