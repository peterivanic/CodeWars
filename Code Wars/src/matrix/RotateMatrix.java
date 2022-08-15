package matrix;

import java.util.Arrays;

public class RotateMatrix {

    public static int[][] rotateCounterclockwise(int[][] matrix, int t) {
        int times = t % 4;
        int[][] result = new int[matrix.length][matrix.length];
        while (times > 0) {

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    result[matrix.length-j-1][i] = matrix[i][j];
                }
            }
            matrix = result;
            result = new int[matrix.length][matrix.length];
            times--;
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(RotateMatrix.rotateCounterclockwise(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}}, 2)));
    }
}
