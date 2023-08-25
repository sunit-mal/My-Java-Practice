import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InCollectionCollectionClass {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();

        li.add(43);
        li.add(23);
        li.add(33);
        li.add(13);
        li.add(30);
        li.add(13);

        System.out.println(Collections.min(li));    //  It return minimun value in a collection framework
        System.out.println(Collections.max(li));    //  It return maximun value in a collection framework
        System.out.println(Collections.frequency(li,13));   //  It return the frequency of an value 

        Collections.sort(li);
        System.out.println(li);
    }
}
