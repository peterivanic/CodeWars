package numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BetterThanAverage {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        int count = 0;
        List<Integer> pointsWithMe = Arrays.stream(classPoints).boxed().collect(Collectors.toList());
        pointsWithMe.add(yourPoints);
        for (Object n :pointsWithMe) {
            count ++;
            sum += (int)n;
        }
        return  yourPoints > sum/count ;
    }

    public static void main(String[] args) {
        int[] points = {100, 40, 34, 57, 29, 72, 57, 88};
        System.out.println(betterThanAverage(points,75));
    }
}
