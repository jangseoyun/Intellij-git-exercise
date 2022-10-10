package codelion.week3.day14.context.domain.count;

import codelion.week3.day14.context.vo.PopulationMoveVo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoveCount {
    public Map<String, Integer> getMoveCntMap(List<PopulationMoveVo> pml) {
        Map<String, Integer> moveCntMap = new HashMap<>();
        for (PopulationMoveVo pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if (moveCntMap.get(key) == null) {
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }

        return moveCntMap;
    }

    public Map<String, Integer> heatmapIdxMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("11",0);
        map.put("26",1);
        map.put("27",2);
        map.put("28",3);
        map.put("29",4);
        map.put("30",5);
        map.put("31",6);
        map.put("36",7);
        map.put("41",8);
        map.put("42",9);
        map.put("43",10);
        map.put("44",11);
        map.put("45",12);
        map.put("46",13);
        map.put("47",14);
        map.put("48",15);
        map.put("50",16);
        return map;
    }
}
