import java.util.HashMap;
import java.util.Map;

public class Find {

    public static int findIt(int[] numbers){
        Map<Integer, Integer> values = new HashMap<>();
        int result = 0;
        for (int number: numbers) {
            if (!values.containsKey(number)){
                values.put(number,1);
            }else {
                int value =values.get(number);
                value ++;
                values.replace(number,value);
            }
        }
        for (Map.Entry<Integer,Integer> entry: values.entrySet()) {
            if (entry.getValue()%2!=0){
                result = entry.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] numbers = {1,2,2,3,3,3,4,3,3,3,2,2,1};
        System.out.println(findIt(numbers));

    }
}
