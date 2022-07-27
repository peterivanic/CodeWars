package words;

import java.util.List;

public class CamelCase {

    public static String camelCase(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] ch = input.toCharArray();
        for (char c : ch){
            if (Character.isUpperCase(c)){
                stringBuilder.append(" ");
                stringBuilder.append(c);
            }else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(CamelCase.camelCase("camelCasing"));
    }
}
