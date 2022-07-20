public class CompSame {

    public static boolean comp(int[] array1, int[] array2) {
        int result = 0;
        if (array1 == null || array2 == null || array1.length != array2.length) {
            return false;
        } else {
            for (int number : array1) {
                for (int i = 0; i < array2.length; i++) {
                    if (array2[i] == number * number) {
                        array2[i] = -1;
                        result++;
                    }
                }
            }
            return result == array1.length;
        }
    }

    public static void main(String[] args) {
        int[] array1 = {121, 144, 19, 161, 19, 144, 19, 11,0,0,0};
        int[] array2 = {121, 14641, 20736, 361, 25921, 361, 20736, 361, 0,0,0};

        System.out.println(comp(array1,array2));
    }

}
