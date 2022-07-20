package numbers;

public class SumOfDigits {
    public static int digitalRoot(int n) {
            String numbers = String.valueOf(n);
            char[] numbArr = numbers.toCharArray();
            int result = 0;
            for (char c : numbArr){
                result += Integer.parseInt(String.valueOf(c));
            }
            if (result > 9){
               result= digitalRoot(result);
            }
            return result;
    }

    public static void main(String[] args) {
        System.out.println(SumOfDigits.digitalRoot(456));
    }
}
