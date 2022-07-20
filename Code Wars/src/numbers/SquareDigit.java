package numbers;

public class SquareDigit {

    public static int squareDigits(int n) {
        String numbers = String.valueOf(n);
        char[] numbArr = numbers.toCharArray();
        String result = "";
        for(char c : numbArr){
            int i = Integer.parseInt(String.valueOf(c));
            int j = i*i;
            String s = String.valueOf(j);
           result = result.concat(s);
        }
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        System.out.println(SquareDigit.squareDigits(9119));
    }
}
