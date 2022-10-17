package codelion.week5.algorithm;

public class Pyramid {
    public void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < i * 2 + 1; k++) {//2개씩 증가
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        pyramid.print(5);
    }
}
