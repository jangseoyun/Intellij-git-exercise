package codelion.week3.day14.context;

import codelion.week3.day14.context.parser.PatientParser;
import codelion.week3.day14.context.domain.PatientVo;
import codelion.week3.day14.context.context.ReadLineContext;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadLineContext readLineContext = new ReadLineContext(new PatientParser());
        List<PatientVo> Patients = readLineContext.readByLine("./8842height.phe.txt");
        for (PatientVo patient : Patients) {
            System.out.println(patient.getHeight());
        }
    }
}
