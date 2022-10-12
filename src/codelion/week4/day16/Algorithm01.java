package codelion.week4.day16;

public class Algorithm01 {
    public int getMax(int[] arr) {
        int max = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Algorithm01 T = new Algorithm01();
        int[] arr = {3, 29, 38, 12, 57, 74, 40, 85, 61};
        System.out.println(T.getMax(arr));

        //test code
        if (T.getMax(arr) == 85) {
            System.out.println("테스트를 통과했습니다");
        } else {
            System.out.println("테스트를 실패했습니다");
        }

    }
}
