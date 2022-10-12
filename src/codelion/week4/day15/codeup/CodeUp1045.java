package codelion.week4.day15.codeup;

import java.util.Scanner;

public class CodeUp1045 {
    public static void main(String[] args) {
        /*첫 줄에 합
        둘째 줄에 차,
        셋째 줄에 곱,
        넷째 줄에 몫,
        다섯째 줄에 나머지,
        여섯째 줄에 나눈 값을 순서대로 출력한다.
        (실수, 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력)*/

        Scanner sc = new Scanner(System.in);
        int first = Integer.parseInt(sc.next());
        int second = Integer.parseInt(sc.next());
        System.out.println(first + second);
        System.out.println(first - second);
        System.out.println(first * second);
        System.out.println(first / second);
        System.out.println(first % second);
        System.out.println(String.format("%.2f", (float)first / second));
    }
}
