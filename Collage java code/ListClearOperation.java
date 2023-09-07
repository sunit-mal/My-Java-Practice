import java.util.LinkedList;
import java.util.List;

public class ListClearOperation {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(18);
        list.add(07);
        list.add(29);
        list.add(17);

        System.out.println(list);
        list.clear();
        System.out.println("After delete all element : "+list);
    }
}
