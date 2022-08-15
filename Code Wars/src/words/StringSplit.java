package words;

public class StringSplit {

    public static String[] split(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);


        if (s.length() % 2 != 0) {
            stringBuilder.append('_');
            s = stringBuilder.toString();
        }

        String[] result = new String[s.length() / 2];

        char[] word = s.toCharArray();
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            if (i % 2 == 0) {
                String st = String.valueOf(word[i]) +
                        word[i + 1];
                result[count] = String.valueOf(st);
                count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(StringSplit.split("abcde"));
    }
}
