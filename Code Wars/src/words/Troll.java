package words;

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        System.out.println(Troll.disemvowel("This website is for losers LOL!"));
    }
}
