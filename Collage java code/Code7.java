import java.util.List;
import java.util.Vector;

public class Code7 {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();
        vector.add(18);
        vector.add(17);
        vector.add(07);
        vector.add(29);

        System.out.println("Element before clear : "+vector);

        vector.clear();
        System.out.println("Element after clear : "+vector);
    }
}
