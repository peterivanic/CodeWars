package test;

import matrix.Antidiagonal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalTest {
    @Test
    public void diagonalOK(){

        int[][] n = {{1, 2, 3},
                {3,4,6},
                {5,2,5}};
        int actual = Antidiagonal.getADiagonalAvg(n,-1);
        int ecepted = 4;
        assertEquals(ecepted,actual);
    }

}