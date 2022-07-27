package words;

public class BackspacesInString {

    public static String cleanString(String s) {
        StringBuilder nsb = new StringBuilder();
        char[] ch = s.toCharArray();
        if (s.length() > 0) {
            for (char c : ch) {
                if (c != '#') {
                    nsb.append(c);
                } else {
                    if (nsb.length() != 0) {
                        nsb.deleteCharAt(nsb.length() - 1);
                    }
                }
            }
            if (ch[ch.length - 1] != '#') {
                if (ch[ch.length - 1] == nsb.charAt(nsb.length() - 1)) {
                    nsb.deleteCharAt(nsb.length() - 1);

                }
                nsb.append(ch[ch.length - 1]);
            }
        }
        return nsb.toString();
    }

    public static void main(String[] args) {
        System.out.println(BackspacesInString.cleanString("##"));
    }

}
