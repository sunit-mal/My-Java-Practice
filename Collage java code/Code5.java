import java.util.List;
import java.util.Vector;

// How to copy or clone a vector?

public class Code5 {
    public static void main(String[] args) {
        List<Integer> vector1 = new Vector<>();
        vector1.add(13);
        vector1.add(3);
        vector1.add(23);
        vector1.add(33);
        System.out.println("Vector 1 element : "+vector1);

        List<Integer> vector2 = new Vector<>(vector1);
        System.out.println("Vector 2 element : "+vector2);
    }
}
