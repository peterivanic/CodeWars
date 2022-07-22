package numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> a1 = new ArrayList<>();
        List<Integer> b1 = new ArrayList<>();
        for (int i : a) {
            a1.add(i);
        }
        for (int i : b) {
            b1.add(i);
        }
       a1.removeAll(b1);
        return a1.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ArrayDiff.arrayDiff(new int [] {1,2,2}, new int[] {1})));
    }
}
