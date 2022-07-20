package words;

import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] charArr = str.toLowerCase(Locale.ROOT).toCharArray();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        List<String> word = Stream.of(str.toCharArray()).map(String::valueOf).toList();

        for (char letter: charArr) {
            for (char v: vowels) {
                if (letter == v ){
                    vowelsCount++;
                }
            }
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        System.out.println(Vowels.getCount("abracadabra"));
    }
}

