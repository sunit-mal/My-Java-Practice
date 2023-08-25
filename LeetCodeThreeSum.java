import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeThreeSum {
    public static void main(String[] args) {

        int numbs[] = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = new ArrayList<>();
        result = threeSum(numbs);

        System.out.println(result);
    }

    public static List<List<Integer>> threeSum(int[] numbs) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(numbs); // Sort the array to easily skip duplicates

        for (int i = 0; i < numbs.length - 2; i++) {
            if (i == 0 || (i > 0 && numbs[i] != numbs[i - 1])) { // Skip duplicates
                int left = i + 1;
                int right = numbs.length - 1;
                int target = 0 - numbs[i];

                while (left < right) {
                    if (numbs[left] + numbs[right] == target) {
                        result.add(Arrays.asList(numbs[i], numbs[left], numbs[right]));

                        // Skip duplicates
                        while (left < right && numbs[left] == numbs[left + 1])
                            left++;
                        while (left < right && numbs[right] == numbs[right - 1])
                            right--;

                        left++;
                        right--;
                    } else if (numbs[left] + numbs[right] < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}
