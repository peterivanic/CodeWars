package numbers;

public class Persistence {
    public static int persistence(long n) {
        char[] numbArr = String.valueOf(n).toCharArray();
        int count = 0;
        int sum = 1;

        while (numbArr.length > 1){
            count ++;
            for (char c : numbArr) {
                sum = sum * Integer.parseInt(String.valueOf(c));
            }
           numbArr = String.valueOf(sum).toCharArray();
            sum=1;
        }
        return count;


//        if (numbArr.length <= 1) {
//            sum = 0;
//        }
//        if (numbArr.length >= 2) {
//            count++;
//            for (char c : numbArr) {
//                sum = sum * Integer.parseInt(String.valueOf(c));
//            }
//            if (sum < 10) {
//                return count;
//            } else {
//                return persistence(sum);
//            }
//        }
//        return count;
    }

    public static void main(String[] args) {
        System.out.println(Persistence.persistence(999));
    }
}
