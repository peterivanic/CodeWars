package words;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Order {
    public static String order(String words) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        String[] stArr = words.split(" ");
        for (String st : stArr) {
            for (char ch : st.toCharArray()) {
                if (isNumeric(String.valueOf(ch))) {
                    map.put(st, (int) Double.parseDouble(String.valueOf(ch)));
                }
            }
        }
        Map<String, Integer> res =
                map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                        .collect(Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (Map.Entry<String, Integer> entry : res.entrySet()) {
            sb.append(entry.getKey());
            sb.append(" ");
        }
        if (sb.isEmpty()) {
            return sb.toString();
        } else
            sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(Order.order("4of Fo1r pe6ople g3ood th5e the2"));
    }

}
