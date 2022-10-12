package codelion.week4.day16;

interface Compare{
    boolean doSomething(int valueA, int valueB);
}

//템플릿 콜백 디자인 패턴
public class MaxNMin {
    public int getMaxOrMin(int[] arr, Compare compare) {//callback
        //최대값과 최소값
        int targetValue = arr[0]; //!!! arr이 음수인 경우 0으로 초기화하면 0이 max

        for (int i = 0; i < arr.length; i++) {
            boolean inSth = compare.doSomething(arr[i], targetValue);
            if (inSth) {
                targetValue = arr[i];
            }
        }

        return targetValue;
    }

    public int max(int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }

    public int min(int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }

    public static void main(String[] args) {
        int[] arr = {-3, -29, -38, -12, -57, -74, -40, -85, -61};
        MaxNMin maxNMin = new MaxNMin();
        int max = maxNMin.max(arr);
        System.out.println(max);
        System.out.println(maxNMin.min(arr));
    }
}
