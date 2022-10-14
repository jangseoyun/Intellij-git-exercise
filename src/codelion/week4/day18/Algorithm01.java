package codelion.week4.day18;

import java.util.Arrays;

public class Algorithm01 {//삽입 정렬 알고리즘

    public int[] solution(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (tmp < arr[j]) {
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
                System.out.println(Arrays.toString(arr));
            }

        }

        return arr;
    }

    public static void main(String[] args) {
        Algorithm01 T = new Algorithm01();
        int[] arr = {8, 5, 6, 2, 4};

        System.out.println(T.solution(arr));
    }
}
