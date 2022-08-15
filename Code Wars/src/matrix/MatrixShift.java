package matrix;

import java.util.ArrayList;
import java.util.List;

public class MatrixShift {

    public static char[][] shift(char[][]m, int n){
        char[][] result  = new char[m.length][m[0].length];
        List<Character> characterList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i <m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                characterList.add(m[i][j]);
            }
        }
        for (int i = 0; i < n; i++) {
            characterList.add(0,characterList.get(characterList.size()-1));
            characterList.remove(characterList.size()-1);
        }

        for (int i = 0; i <m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                result[i][j] = characterList.get(count);
                count++;
            }
        }

        return result;

    }
}
