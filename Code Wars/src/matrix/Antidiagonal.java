package matrix;

import java.util.Arrays;
import java.util.List;

public class Antidiagonal {
/*27. Anti diagonal

    Create a function called getADiagonalAvg that takes a multidimensional array (only integers) which represents a square matrix and integer
    value (1 => for diagonal, -1 => for antidiagonal), as parameters and returns the average of the numbers in the specified diagonal.

    You cannot nest loops within each other. Your solution has to use only one loop which handles both diagonal and antidiagonal case inside.

    Example cases:

    getADiagonalAvg(
[
        [1, 2, 3],
        [3, 4, 6],
        [5, 2, 5]
        ],
        -1);
    Should return 4, because (3 + 4 + 5) / 3 = 4.

    getADiagonalAvg(
[
        [3, 5, 11, -2],
        [3, 1, 7, 4],
        [5, 0, 2, 9],
        [21, 7, 8, 2]
        ],
        1);
    Should return 2, because (3 + 1 + 2 + 2) / 4 = 2.*/

    public static int getADiagonalAvg(int[][] numbArr, int n) {
        List<int[]> l = Arrays.stream(numbArr).toList();
        int j = 0;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbArr.length; i++) {
            if (n == 1) {
                if (j == i) {
                    sum += l.get(j)[i];
                    count++;
                    j++;
                }
            }
            if (n == -1) {
                sum += l.get(numbArr.length - j - 1)[i];
                j++;
                count++;
            }
        }
        return sum / count;
    }

    public static void main(String[] args) {

        int[][] n = {{1, 2, 3},
                {3,4,6},
                {5,2,5}};
        int[][] m = {{3,5,11,-2},
                {3,1,7,4},
                {5,0,2,9},
                {21,7,8,2}};
        System.out.println(Antidiagonal.getADiagonalAvg(m,1));
    }
}
