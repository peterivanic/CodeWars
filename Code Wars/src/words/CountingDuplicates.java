package words;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        Map<Character, Integer> res = new HashMap<>();
        int count = 0;
        for (char ch : text.toLowerCase().toCharArray()) {
            if (!res.containsKey(ch)) {
                res.put(ch, 1);
            } else {
                int value = res.get(ch);
                value++;
                res.replace(ch, value);
            }
        }
        for (Map.Entry<Character, Integer> entry : res.entrySet()) {
            if (entry.getValue() >= 2) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(CountingDuplicates.duplicateCount("Indivisibilities"));
    }
}
