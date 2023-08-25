//  How to copy vector to array?

import java.util.List;
import java.util.Vector;

public class Code8 {
    public static void main(String[] args) {
        int array[] = {1,42,2,43,11};
        List<Integer> vector = new Vector<>();
        for (Integer element : array) {
            vector.add(element);
        }

        System.out.println(vector);
    }
}
