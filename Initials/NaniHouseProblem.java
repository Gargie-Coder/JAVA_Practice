package Initials;
import java.util.Arrays;

public class NaniHouseProblem {

    public static int solveNaniHouseProblem(int[] weights) {
        final int MAX_WEIGHT = 5000;
        Arrays.sort(weights);

        int totalWeight = 0;
        int count = 0;

        for (int w : weights) {
            if (totalWeight + w <= MAX_WEIGHT) {
                totalWeight += w;
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] weights = {200, 1800, 1200, 1500, 500, 800, 4000};
        int result = solveNaniHouseProblem(weights);

        System.out.println("Maximum toys Nani can take: " + result);
    }
}
