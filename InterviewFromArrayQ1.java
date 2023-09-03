// Kadane's Algorithm (maximum sum subarray from given array)

public class InterviewFromArrayQ1 {
    public static void main(String[] args) {
        int[] array = { -3, -4, 5, -1, 2, -4, 6, -1 };
        // int[] array = { -2, 3, -1, 2 };
        System.out.println(solution(array, 0));
    }

    static int solution(int[] array, int sum) {
        if (array.length > 1) {
            int firstIndex = 0;
            int lastIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 0) {
                    firstIndex = i;
                    break;
                }
            }
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] >= 0) {
                    lastIndex = i;
                    break;
                }
            }
            int newSum = total(array, firstIndex, lastIndex);
            if (sum <= newSum) {
                sum = newSum;
            }

            int[] newArray = new int[((lastIndex - firstIndex))];
            int j = 0;
            for (int i = firstIndex; i < lastIndex; i++) {
                newArray[j] = array[i];
                j++;
            }
            return solution(newArray, sum);
        }
        return sum;
    }

    static int total(int[] array, int i, int j) {
        int resultSum = 0;
        for (int j2 = i; j2 <= j; j2++) {
            resultSum += array[j2];
        }
        return resultSum;
    }
}
