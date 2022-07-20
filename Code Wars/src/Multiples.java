public class Multiples {

    public static int multiples(int number){
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 ){
                sum += i;
            }
            if (i % 5 == 0 ){
                sum += i;
            }
            if (i % 15 == 0){
                sum -= i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(multiples(16));

    }
}