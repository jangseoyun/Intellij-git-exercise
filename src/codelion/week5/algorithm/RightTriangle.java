package codelion.week5.algorithm;

public class RightTriangle {

    private String letter = "*";

    public RightTriangle() {
    }

    public RightTriangle(String input) {
        this.letter = input;
    }

    public void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(this.letter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RightTriangle rt = new RightTriangle();
        rt.print(4);
    }
}
