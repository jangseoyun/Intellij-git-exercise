package codelion.week3.day14.file;

public class SidoCodeKor implements TranslationCode {
    protected String sidoKor;

    public SidoCodeKor(String sidoKor) {
        this.sidoKor = sidoKor;
    }

    //행정구역 코드 서울 : 11 /부산 : 21 /대구 : 22 /인천 :23 /광주 : 24 /대전 : 25 /울산 :26
    // 세종 : 29 /경기도 : 31/강원도 :32/ 충북 : 33 /충남 :34 /전북 : 35 /전남 : 36 /경북 : 37 /경남 : 38 /제주 : 39
    @Override
    public String TrlSidoCode(int sidoCode) {
        switch (sidoCode) {
            case 11:
                sidoKor = "서울";
                break;
            case 21:
                sidoKor = "부산";
                break;
            case 22:
                sidoKor = "대구";
                break;
            case 23:
                sidoKor = "인천";
                break;
            case 24:
                sidoKor = "광주";
                break;
            case 25:
                sidoKor = "대전";
                break;
            case 26:
                sidoKor = "울산";
                break;
            case 29:
                sidoKor = "세종";
                break;
            case 31:
                sidoKor = "경기도";
                break;
            case 32:
                sidoKor = "강원도";
                break;
            case 33:
                sidoKor = "충북";
                break;
            case 34:
                sidoKor = "충남";
                break;
            case 35:
                sidoKor = "전북";
                break;
            case 36:
                sidoKor = "전남";
                break;
            case 37:
                sidoKor = "걍븍";
                break;
            case 38:
                sidoKor = "경남";
                break;
            case 39:
                sidoKor = "제주";
                break;
        }

        return sidoKor;
    }
}
