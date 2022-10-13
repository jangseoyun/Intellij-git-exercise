package codelion.week4.day16;

public class Algorithm03Min {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {3, 23, 85, 34, 17, 74, 25, 52, 65},
                {10, 7, 39, 42, 88, 52, 14, 72, 63},
                {87, 42, 18, 78, 53, 45, 18, 84, 53},
                {34, 28, 64, 85, 12, 16, 75, 36, 55},
                {21, 77, 45, 35, 28, 75, 90, 76, 1},
                {25, 87, 65, 15, 28, 11, 37, 28, 74},
                {65, 27, 75, 41, 7, 89, 78, 64, 39},
                {47, 47, 70, 45, 23, 65, 3, 41, 44},
                {87, 13, 82, 38, 31, 12, 29, 29, 80}
        };
        //loop를 돌아야 합니다 9x9
        //for문을 통해 배열을 전부 돌면서 찾을 수 있겠지만 자원낭비
        int min = arr[0][0];
        int[] maxIdx = {0, 0};
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                //int nowValue = arr[i][j]; // 1. 가로 / j가 먼저 바뀐다 j가 0~9까지 한번 돌면 i가 1씩 올라감
                //int b = arr[j][i]; // 2. 세로
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    maxIdx[0] = i;
                    maxIdx[1] = j;
                }
            }
        }

        System.out.println(min);
    }
}