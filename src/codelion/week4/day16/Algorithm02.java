package codelion.week4.day16;

public class Algorithm02 {
    public int[] getMax(int[] arr) {
        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIdx = i;
            }
        }

        return new int[]{max, maxIdx};
    }
    public static void main(String[] args) {
        Algorithm02 T = new Algorithm02();
        //입력값이 음수일 때의 최대값
        int[] arr = {-3, -29, -38, -12, -57, -74, -40, -85, -61};
        int[] result = T.getMax(arr);
        for (int i : result) {
            System.out.println(i);
        }

        //test code
        if (result[0] == -3 && result[1] == 0 ){
            System.out.println("테스트를 통과했습니다");
        } else {
            System.out.println("테스트를 실패했습니다");
        }

    }
}
