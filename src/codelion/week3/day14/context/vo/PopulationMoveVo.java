package codelion.week3.day14.context.vo;

import java.util.HashMap;
import java.util.Map;

public class PopulationMoveVo {
    private int fromSido;
    private int toSido;
    private String fromSidoKorean;
    private String toSidoKorean;
    private Map<Integer, String> sidoMap; //중복 허용 불가

    //constructor추가 fromSido, toSido를 받아서 멤버변수에 넣는다
    public PopulationMoveVo(String fromSido, String toSido) {
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
        this.sidoMap = getSidoMap();
    }

    public PopulationMoveVo(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
        this.sidoMap = getSidoMap();
    }

    public void setSidoMap() {
        this.sidoMap = new HashMap<>();
        sidoMap.put(11,"서울특별시");
        sidoMap.put(26,"부산광역시");
        sidoMap.put(27,"대구광역시");
        sidoMap.put(28,"인천광역시");
        sidoMap.put(29,"광주광역시");
        sidoMap.put(30,"대전광역시");
        sidoMap.put(31,"울산광역시");
        sidoMap.put(36,"세종특별자치시");
        sidoMap.put(41,"경기도");
        sidoMap.put(42,"강원도");
        sidoMap.put(43,"충청북도");
        sidoMap.put(44,"충청남도");
        sidoMap.put(45,"전라북도");
        sidoMap.put(46,"전라남도");
        sidoMap.put(47,"경상북도");
        sidoMap.put(48,"경상남도");
        sidoMap.put(50,"제주특별자치도");
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    public String getFromSidoKorean() {
        return fromSidoKorean;
    }

    public String getToSidoKorean() {
        return toSidoKorean;
    }

    public Map<Integer, String> getSidoMap() {
        return sidoMap;
    }
}
