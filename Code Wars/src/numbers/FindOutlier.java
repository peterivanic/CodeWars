package numbers;

import java.util.ArrayList;
import java.util.List;

public class FindOutlier {

    static int find(int[] integers) {
        int countOdd = 0;
        int countEven = 0;
        int result = 0;
        List<Integer> a1 = new ArrayList<>();
        for (int i : integers) {
            if (i % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            a1.add(i);
        }
        if (countEven > countOdd) {
            for (int i : a1) {
                    if (i % 2 == 1||i%2==-1) {
                        result = i;
                }
            }
        } else {
            for (int i : a1) {
                if (i % 2 == 0) {
                    result = i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(FindOutlier.find(new int[]{-3,0,2,4}));
    }
}
