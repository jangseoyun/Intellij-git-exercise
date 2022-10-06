package codelion.week3.day13.set;

import java.util.HashSet;
import java.util.Set;

public class RandomAlphabet {
    public static void main(String[] args) {
        AlphabetGenerator alphabetGenerator = new AlphabetGeneratorImpl();
        Set<Character> setAlphabet = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            char c = alphabetGenerator.generate();
            setAlphabet.add(c);
        }
        System.out.println(setAlphabet);

    }
}
