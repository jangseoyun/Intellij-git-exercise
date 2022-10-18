package codelion.week5.day20.algorithm;

public class AlgorithmStar {
    public void printStar(int n, String now) {
        if (n == now.length()) {
            System.out.println("종료");
            return;
        }
        System.out.print(now + "\n");
        printStar(10, now + "*");
    }

    public static void main(String[] args) {
        new AlgorithmStar().printStar(5, "");
    }
}
