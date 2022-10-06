package codelion.week3.day13.map;

import java.util.HashMap;

public class AlphabetCntMap {
    public static void main(String[] args) {
        String address = "https://github.com/Kyeongrok/like-lion-java".toLowerCase();
        HashMap<Character, Integer> addressMap = new HashMap<>();
        int count = 0;

        for (int i = 0; i < address.length(); i++) {
            if (Character.isAlphabetic(address.charAt(i))) {
                for (int j = 1; j < address.length(); j++) {
                    if (address.charAt(i) == address.charAt(j)) {
                        count += 1;
                    }
                }
                addressMap.put(address.charAt(i), count);
                count = 0;
            }
        }

        System.out.println(addressMap);

    }
}
