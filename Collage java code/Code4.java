//  How to read all elements in vector by using iterator?
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


public class Code4 {
    public static void main(String[] args) {
        List<Integer> ve = new Vector<>();
        ve.add(12);
        ve.add(31);
        ve.add(21);
        ve.add(1);
        
        Iterator<Integer> it = ve.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }
}
