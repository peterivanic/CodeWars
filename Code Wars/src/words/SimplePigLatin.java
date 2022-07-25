package words;

public class SimplePigLatin {

    public static String pigIt(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        int e = 0;

        for (String w : words) {
            e++;
            char[] ch = w.toCharArray();
            if (Character.isAlphabetic(ch[0])) {
                for (int i = 1; i < ch.length; i++) {
                    sb.append(ch[i]);
                }
                sb.append(ch[0]);
                sb.append("ay");
                if (e < words.length) {
                    sb.append(" ");
                }
            } else {
                sb.append(ch[0]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(SimplePigLatin.pigIt("O Pig latin is cool"));
    }
}
