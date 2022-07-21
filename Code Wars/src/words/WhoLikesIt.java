package words;

import java.util.Arrays;
import java.util.List;

public class WhoLikesIt {

    public static String whoLikesIt(String... n) {
        List<String> names = Arrays.stream(n).toList();
        if (names.size() == 0) {
           return "no one likes this";
        }
        if (names.size() == 1) {
            return String.format("%s likes this", names.get(0));
        }
        if (names.size() == 2) {
            return String.format("%s and %s like this", names.get(0), names.get(1));
        }
        if (names.size() == 3) {
            return String.format("%s, %s and %s like this", names.get(0), names.get(1), names.get(2));
        }
        int i = names.size() - 2;
        return String.format("%s, %s and %d others like this", names.get(0), names.get(1), i);
    }

    public static void main(String[] args) {
        System.out.println(WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
