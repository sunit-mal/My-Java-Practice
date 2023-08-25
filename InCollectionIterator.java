import java.util.ArrayList;
import java.util.Iterator;

public class InCollectionIterator {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(112);
        al.add(34);
        al.add(132);

        Iterator it = al.iterator();

        while (it.hasNext()) {
            int c = (Integer)it.next();
            System.out.println(c);
        }
    }
}
