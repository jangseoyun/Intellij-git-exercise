package codelion.week3.day14.file;

public class SidoCodeKor implements TranslateCode {
    private String sidoKor;

    
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
