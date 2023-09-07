//  How to add all elements of a list to vector?

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListToVector {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(12);
        li.add(11);
        li.add(22);
        li.add(1);

        List<Integer> ve = new Vector<>(li);
        System.out.println("Element Copy from list to vector : "+ve);
    }
}
