package codelion.week4.day18;

import java.util.Arrays;

public class Algorithm01Sort2 {//삽입 정렬 알고리즘

    public int[] solution(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                //System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Algorithm01Sort2 T = new Algorithm01Sort2();
        int[] arr = {8, 5, 6, 2, 4};
        System.out.println(Arrays.toString(T.solution(arr)));
    }
}
