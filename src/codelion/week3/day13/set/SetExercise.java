package codelion.week3.day13.set;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        HashSet<Object> set1 = new HashSet<>();
        set1.add("김경록");
        set1.add("김경록");
        set1.add("김미미");

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(3);

        System.out.println(setInteger);


    }
}
