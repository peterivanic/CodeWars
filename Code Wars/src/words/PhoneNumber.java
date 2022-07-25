package words;

public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
            if (i == 2){
                sb.append(") ");
            }
            if (i ==5){
                sb.append("-");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(PhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
