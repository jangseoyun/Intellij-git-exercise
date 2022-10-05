package codelion.java.week3;

public class Calculator02 {

    private int a;
    private int b;

    public Calculator02(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void plus() {
        System.out.println(a + b);
    }

    public void minus() {
        System.out.println(a - b);
    }

    public void multiple() {
        System.out.println(a * b);
    }

    public void divide() {
        System.out.println((float) a / b);
    }
}

