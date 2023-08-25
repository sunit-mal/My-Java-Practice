import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int array[] = { 1, 5, 21, 9, 10, 0, 4, 22 };
        Arrays.parallelSort(array);

        if (elementSearch(array, 0, array.length - 1, 4)) {
            System.out.println("present in array");
        } else {
            System.out.println("Not present in array");
        }
    }

    public static boolean elementSearch(int array[], int start, int end, int target) {
        if (end >= start) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target)
                return true;
            else {
                if (array[mid] > target)
                    return elementSearch(array, start, mid - 1, target);
                else
                    return elementSearch(array, mid + 1, end, target);
            }
        } else
            return false;

    }
}
