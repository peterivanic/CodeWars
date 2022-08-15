package matrix;

public class MatrixAddition {

    public static int[][] matrixAddition(int[][] a, int[][] b) {
        int[][] res= new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    }
}
