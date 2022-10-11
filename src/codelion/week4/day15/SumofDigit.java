package codelion.week4.day15;

public class SumofDigit {
    public int solution(int n) {
        // % 연산 이용 몫, 나머지
        int result = 0;
        //int n = n;// 공간복잡도 증가

        //for문으로 가능한가?
        //while문
        while (n > 0) {
            result += n % 10; //나머지를 먼저 구할 것
            n = n / 10;
            System.out.println("result" + result + "n" + n);
        }
        return result;
    }
    public static void main(String[] args) {
        SumofDigit sumofDigit = new SumofDigit();
        int result = sumofDigit.solution(1234);

        if (result == 10) {
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.println("테스트 실패 했습니다.");
        }
    }
}
