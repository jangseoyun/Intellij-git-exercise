package codelion.week3.day14.context;

import codelion.week3.day14.context.context.ReadLineContext;
import codelion.week3.day14.context.context.WriteContext;
import codelion.week3.day14.context.domain.count.MoveCount;
import codelion.week3.day14.context.domain.parser.PopulationMoveParser;
import codelion.week3.day14.context.vo.PopulationMoveVo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationApp {
    public static void main(String[] args) throws IOException {
        String address = "/Users/seoyun/codeLion/2021_인구관련연간자료_20220927_66125.csv";
        String getData = "from_to.txt";
        String addCntData = "each_sido_cnt2.txt";
        String targetAddress = "for_heatmap.txt";

        ReadLineContext<PopulationMoveVo> populationContext = new ReadLineContext<>(new PopulationMoveParser());
        List<PopulationMoveVo> populationList = populationContext.readByLine(getData);//파일 읽어온뒤 객체로 만들어서 리스트에 담기

        /*List<String> origin = new ArrayList<>();
        for (PopulationMoveVo populationMoveVo : populationList) {
            System.out.println(populationMoveVo.getFromSido() + "," + populationMoveVo.getToSido() + "\n");
            //origin.add(populationMoveVo.getFromSido() + "," + populationMoveVo.getToSido() + "\n");
        }
        WriteContext writeContext = new WriteContext(getData);
        writeContext.write(origin, getData);*/

        //이동인구수 count 구해서 Map에 넣기
        Map<String, Integer> moveCntMap = new MoveCount().getMoveCntMap(populationList);
        Map<String, Integer> heatMapIdxMap = new MoveCount().heatmapIdxMap();

        //전입, 전출, count 데이터 가공하여 파일에 쓰기
        List<String> cntResult = new ArrayList<>();
        for (String key : moveCntMap.keySet()) {
            String[] fromTo = key.split(",");
            String s = String.format("[%s, %s, %d],", heatMapIdxMap.get(fromTo[0]), heatMapIdxMap.get(fromTo[1]), moveCntMap.get(key));
            cntResult.add(s);
            //System.out.printf("[%s, %s, %d]\n", fromTo[0], fromTo[1], moveCntMap.get(key));
        }
        WriteContext writeContext = new WriteContext(targetAddress);
        writeContext.write(cntResult, targetAddress);

    }
}
