package codelion.week4.day15;

import java.util.Scanner;

public class Algorithm {
    /*자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
            예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.*/
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10; //나머지를 먼저 구할 것
            n = n / 10;
        }

        return answer;
    }
    public static void main(String[] args) {
        Algorithm T = new Algorithm();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(T.solution(input));
    }
}
