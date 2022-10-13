package codelion.week4.day17.algorithm;

import java.util.Arrays;

public class Algorithm01 {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }

    public static void main(String[] args) {
        //오름차순 또는 내림차순으로 정렬하는 알고리즘
        Algorithm01 T = new Algorithm01();
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        System.out.println(Arrays.toString(T.sort(arr)));
    }
}
